package com.power.doc.controller;

import com.power.common.model.CommonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.context.request.async.WebAsyncTask;


import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

import jakarta.annotation.Resource;


/**
 *  异步返回信息测试
 * @author yu 2019/9/22.
 * @ignore
 */
@RestController
public class AsyncController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncController.class);

    @Resource
    private ThreadPoolTaskExecutor executor;

    /**
     * 返回Callable&lt;CommonResult&gt;
     *
     * @return
     */
    @GetMapping(value = "/testCallable")
    public Callable<CommonResult> testCallable() {
        return () -> {
            long sleep = ThreadLocalRandom.current().nextInt(1000);
            LOGGER.info("睡眠时间：{}", sleep);
            Thread.sleep(sleep);
            return CommonResult.ok().setResult("Hello World !!");
        };
    }

    /**
     * 返回DeferredResult&lt;CommonResult&lt;String&gt;&gt;
     *
     * @return
     */
    @GetMapping("/async-deferredresult")
    public DeferredResult<CommonResult<String>> handleReqDefResult() {
        LOGGER.info("Received async-deferredresult request");
        DeferredResult<CommonResult<String>> output = new DeferredResult<>();

        executor.submit(() -> {
            LOGGER.info("Processing in separate thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                LOGGER.error("InterruptedException while executing the thread {}", e.fillInStackTrace());
            }
            output.setResult(CommonResult.ok().setResult("deferred return"));
        });

        LOGGER.info("servlet thread freed");
        return output;
    }

    /**
     * 返回WebAsyncTask&lt;CommonResult&gt;
     *
     * @return
     */
    @GetMapping("/WebAsync/timeout")
    public WebAsyncTask<CommonResult> asyncTaskTimeout() {
        LOGGER.info("WebAsyncTask  timeout处理测试");
        // 模拟开启一个异步任务，超时时间为10s
        WebAsyncTask<CommonResult> asyncTask = new WebAsyncTask<>(5 * 1000L, () -> {
            LOGGER.info("执行业务处理");
            // 任务处理时间5s，不超时
            Thread.sleep(6 * 1000L);
            return CommonResult.ok().setResult("webAsyncTask");
        });

        // 任务执行完成时调用该方法
        asyncTask.onCompletion(() -> LOGGER.info("任务执行完成"));
        asyncTask.onTimeout(() -> {
            LOGGER.error("任务执行异常");
            return CommonResult.fail("500","超时异常");
        });

        LOGGER.info("继续处理其他事情");
        return asyncTask;
    }

    /**
     * 返回Future&lt;CommonResult&lt;String&gt;&gt;
     * @return
     */
    @GetMapping("/future")
    public Future<CommonResult<String>> futureTest() {

        return new AsyncResult<>(CommonResult.ok());
    }

    /**
     * 返回CompletableFuture&lt;CommonResult&lt;String&gt;&gt;
     * @return
     */
    @GetMapping("/completableFuture")
    public CompletableFuture<CommonResult<String>> completableFutureTest() {
        return CompletableFuture.completedFuture(CommonResult.ok());
    }


}

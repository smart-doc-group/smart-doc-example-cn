package com.power.doc.controller;

import com.power.common.model.CommonResult;
import com.power.doc.entity.issue680.MockEscapeJsonReq;
import com.power.doc.entity.issue680.MockEscapeJsonRes;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Mock escape Test
 *
 * @author <a href="mailto:cqmike0315@gmail.com" rel="nofollow">chenqi</a>
 * @version 1.0
 */
@RestController
public class MockEscapeController {

    /**
     * 测试双引号mock
     *
     * @param cron         cron|*\/5 * * * * ?
     * @param text         文本|"i am text"
     * @param quotesText   单引号文本|'ddd add'
     * @param noQuotesText 无引号文本|ddd add
     * @return
     */
    @PostMapping("/testMockQuotes")
    public CommonResult<Void> testMockQuotes(
            @RequestParam String cron,
            @RequestParam String text,
            @RequestParam String quotesText,
            @RequestParam String noQuotesText
    ) {
        return CommonResult.ok();
    }


    /**
     * 测试双引号mock表单
     *
     * @return
     */
    @PostMapping("/testMockQuotesForm")
    public CommonResult<Void> testMockQuotesForm(MockEscapeJsonReq req
    ) {
        return CommonResult.ok();
    }

    /**
     * 测试json转义mock
     *
     * @param req
     * @return
     */
    @PostMapping("/testMockQuotesJson")
    public CommonResult<MockEscapeJsonRes> testMockQuotesJson(@RequestBody MockEscapeJsonReq req) {

        return CommonResult.ok();
    }
}

package com.power.doc.controller.torna;

import com.power.common.model.CommonResult;
import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author Joker
 */
@RestController
public class TestTreeTornaController {

    @Data
    public static class TestVO {
        /**
         * the nickname
         */
        private String name;

        /**
         * sex
         */
        private String sex;

        /**
         * test two tree vo
         */
        private Collection<TestTwoVO> list;

        @Data
        public static class TestTwoVO {
            /**
             * 主键
             */
            private Long id;

            /**
             * address
             */
            private String address;

            /**
             * test three list
             */
            private Collection<TestThreeVO> threeList;
        }

        @Data
        public static class TestThreeVO {

            /**
             * abc
             */
            private String abc;
        }
    }

    /**
     * test torna tree
     *
     * @return
     */
    @PostMapping("/test1")
    public CommonResult<Void> test1(TestVO vo) {


        return CommonResult.ok();
    }

    /**
     * test torna tree json
     *
     * @return
     */
    @PostMapping("/test2")
    public CommonResult<Void> test2(@RequestBody TestVO vo) {


        return CommonResult.ok();
    }

}

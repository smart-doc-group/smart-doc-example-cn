package com.power.doc.controller.feign;

import com.power.doc.constants.RequestHeadValue;
import com.power.doc.controller.feign.AFeignInterface;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * feign测试
 * @restApi
 * @author yu 2020/6/21.
 */
@FeignClient(value = "SER0",path = RequestHeadValue.PREFIX + RequestHeadValue.URL)
public interface AFeignClient extends AFeignInterface {

}

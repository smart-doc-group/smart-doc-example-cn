package com.power.doc.controller.exchange;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

/**
 * Test for Spring {@code @HttpExchange} declarations.
 *
 * @author smart-doc
 */
@HttpExchange("/exchange")
public interface UserExchangeService {

    /**
     * Get a user name by id.
     *
     * @param id user id
     * @return user name
     */
    @GetExchange("/name")
    String getName(@RequestParam("id") String id);

}

package com.mxmvc.controller;

import com.mxmvc.redis.RedisClientTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import scala.util.parsing.combinator.testing.Str;

/**
 * Created by menxu on 18/6/6.
 */
@Controller
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisClientTemplate redisClientTemplate;

    @ResponseBody
    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insert(String key, String value) {
        return redisClientTemplate.set(key, value);
    }

    @ResponseBody
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String insert(String key) {
        return redisClientTemplate.get(key);
    }
}

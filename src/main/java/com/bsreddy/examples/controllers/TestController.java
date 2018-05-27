package com.bsreddy.examples.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by srbollavaram on 16/6/17.
 */
@Controller
public class TestController {
    @RequestMapping(value = "/printDate", method = RequestMethod.GET)
    @ResponseBody
    public String printDate() {
        return new Date().toString();
    }
}

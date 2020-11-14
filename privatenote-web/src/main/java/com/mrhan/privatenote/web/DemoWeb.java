package com.mrhan.privatenote.web;

import com.mrhan.privatenote.biz.DemoBiz;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Han
 * @version : DemoWeb.java, v 0.1 2020年11月14日 17:47 Han Exp $
 * @blame F5 losers
 */
@RestController
@RequestMapping("/demo")
public class DemoWeb {

    @Resource
    DemoBiz demoBiz;

    @GetMapping("/get")
    public String get() {
        return demoBiz.get();
    }
}
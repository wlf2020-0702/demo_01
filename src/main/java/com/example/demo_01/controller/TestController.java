package com.example.demo_01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wlf
 * @Date: 2020/7/2
 * @Description:
 */
@RestController
@RequestMapping("/demo")
public class TestController {

  @GetMapping(value = "/test")
  @ResponseBody
  public String test() {
    return "自动发布-4";
  }
}

package com.webpage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Nicolas on 17/1/2019.
 */
@Controller
public class IndexController {

  @RequestMapping("/")
  public String showIndex(){
    return "index";
  }
}

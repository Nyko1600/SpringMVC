package com.webpage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public String init(Model model) {
    model.addAttribute("msg", "Please Enter Your Login Details");
    return "login";
  }

  @RequestMapping(value = "/validate", method = RequestMethod.POST)
  public String submit(@ModelAttribute("loginBean") LoginBean loginBean,
                       Model model) {
    if (loginBean != null && loginBean.getUserName() != null & loginBean.getPassword() != null) {
      if (loginBean.getUserName().equals("JCquiroga") && loginBean.getPassword().equals("JCquiroga")) {
        model.addAttribute("msg", loginBean.getUserName());
        return "access";
      } else {
        model.addAttribute("error", "Invalid Details");
        return "login";
      }
    } else {
      model.addAttribute("error", "Please enter Details");
      return "login";
    }
  }
}

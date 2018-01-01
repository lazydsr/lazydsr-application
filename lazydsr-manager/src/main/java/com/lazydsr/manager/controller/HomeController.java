package com.lazydsr.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * HomeController
 * PROJECT_NAME: lazydsr-application
 * PACKAGE_NAME: com.lazydsr.manager.controller
 * Created by Lazy on 2018/1/1 21:51
 * Version: 0.1
 * Info: @TODO:...
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping({"/", "index"})
    public ModelAndView index(ModelAndView model) {
        model.setViewName("ftl/home/index");
        return model;
    }
}

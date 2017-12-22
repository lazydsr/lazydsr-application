package com.lazydsr.manager.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * HomeController
 * PROJECT_NAME: lazydsr-application
 * PACKAGE_NAME: com.lazydsr.manager.controller
 * Created by Lazy on 2017/12/22 13:12
 * Version: 0.1
 * Info: @TODO:...
 */
@Controller
@Slf4j
@RequestMapping("/")
public class HomeController {
    @RequestMapping("/")
    public ModelAndView home(ModelAndView model) {
        model.setViewName("ftl/index");
        return model;
    }
}

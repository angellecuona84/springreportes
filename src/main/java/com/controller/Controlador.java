package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Angel Luis on 13/05/2015.
 */
@Controller
public class Controlador {


    @RequestMapping("/index")
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}

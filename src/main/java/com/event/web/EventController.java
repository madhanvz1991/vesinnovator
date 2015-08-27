package com.event.web;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventController {

    @RequestMapping("/")
    public String root(ModelMap map, HttpServletRequest request) {

        return "index";
    }

    @RequestMapping("/home")
    public String home(ModelMap map, HttpServletRequest request) {

        return "home";
    }

    @RequestMapping("/getEventList")
    public String home1(ModelMap map, HttpServletRequest request) {

        return "eventList";
    }
}

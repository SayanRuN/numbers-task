package sayan.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(path = "/main")
public class MainPageController {
    @GetMapping
    public ModelAndView show_avg_value() {
        return new ModelAndView("Main_page");
    }
}
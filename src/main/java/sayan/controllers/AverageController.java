package sayan.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import sayan.tasks.AverageTask;

@RestController
@RequestMapping(path = "/avg")
public class AverageController {
    @GetMapping(path = "/find_avg")
    public ModelAndView show_avg_value(
            @RequestParam(required = false) String list
    ) {
        ModelAndView modelAndView = new ModelAndView("Average_page");
        modelAndView.addObject("value", AverageTask.avg(list));
        return modelAndView;
    }
}
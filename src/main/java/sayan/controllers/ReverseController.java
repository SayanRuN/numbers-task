package sayan.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import sayan.tasks.ReverseTask;

@RestController
@RequestMapping(path = "/reverse")
public class ReverseController {
    @GetMapping(path = "/find_reverse")
    public ModelAndView show_reverse(
            @RequestParam(required = false) String number
    ) {
        ModelAndView modelAndView = new ModelAndView("Reverse_page");
        modelAndView.addObject("reverse", ReverseTask.reverse(number));
        return modelAndView;
    }
}
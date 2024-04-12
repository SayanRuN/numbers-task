package sayan.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import sayan.tasks.PalindromeTask;

@RestController
@RequestMapping(path = "/pal")
public class PalindromeController {
    @GetMapping(path = "/find_pal")
    public ModelAndView show_pal(
            @RequestParam(required = false) String palindromeWord
    ) {
        ModelAndView modelAndView = new ModelAndView("Palindrome_page");
        modelAndView.addObject("palindrome", PalindromeTask.palindrome(palindromeWord));
        return modelAndView;
    }
}
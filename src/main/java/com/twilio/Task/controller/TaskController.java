package com.twilio.Task.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {
    @GetMapping("/")
    public String viewHomePage(Model model) {
       // model.addAttribute("listEmployees",employeeService.getAllEmployees());
        return "index";

    }

}

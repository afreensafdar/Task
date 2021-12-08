package com.twilio.Task.controller;

import com.twilio.Task.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class TaskController {
    @GetMapping("/")
    public String viewHomePage(Model model) {
       // model.addAttribute("listEmployees",employeeService.getAllEmployees());
        return "index";

    }
    @GetMapping("/showNewTaskForm")
    public String showNewTaskForm(Model model) {
        //create model attribute to bind form data
        Task task=new Task();
        model.addAttribute("task",task);
        return "new_task";
    }
    /*

     @PostMapping("/saveEmployee")
//    public String saveEmployee(@ModelAttribute("task") Task employee) {
//        //save employee to database
//        employeeService.saveEmployee(employee);
//        return "redirect:/";

    //}

    /*
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable (value="id") long id ,Model model) {
        //get employee from the service
        Employee employee=employeeService.getEmployeeById(id);

        //set employee as a model attribute to pre-populate the form

        model.addAttribute("employee",employee);
        return "update_employee";


    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable(value ="id") long id) {
        //call delete employee method
        this.employeeService.deleteEmployeeById(id);
        return "redirect:/";
    }
     */

}

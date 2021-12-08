package com.twilio.Task.controller;

import com.twilio.Task.TaskApplication;
import com.twilio.Task.model.Task;
import com.twilio.Task.twilio.SmsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/sms")
public class TwilioController {

    private final TaskApplication.Service service;

    @Autowired
    public TwilioController(TaskApplication.Service service) {
        this.service = service;
    }

    @PostMapping
    public void sendSms(@Valid @RequestBody SmsRequest smsRequest) {

        service.sendSms(smsRequest);
    }
}


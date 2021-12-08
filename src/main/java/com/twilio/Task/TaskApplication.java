package com.twilio.Task;

import com.twilio.Task.twilio.SmsRequest;
import com.twilio.Task.twilio.SmsSender;
import com.twilio.Task.twilio.TwilioSmsSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskApplication.class, args);
	}

	@org.springframework.stereotype.Service
	public static class Service {

		private final SmsSender smsSender;

		@Autowired
		public Service(@Qualifier("twilio") TwilioSmsSender smsSender) {
			this.smsSender = smsSender;
		}

		public void sendSms(SmsRequest smsRequest) {
			smsSender.sendSms(smsRequest);
		}
	}
}




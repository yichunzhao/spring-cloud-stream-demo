package com.ynz.demo.springcloudstream.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(EmployeeRegChannels.class)
public class ProducerApplication {


	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}

}

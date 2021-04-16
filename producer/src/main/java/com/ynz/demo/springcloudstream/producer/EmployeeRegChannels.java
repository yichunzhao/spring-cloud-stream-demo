package com.ynz.demo.springcloudstream.producer;


import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface EmployeeRegChannels {

    @Output
    MessageChannel employeeRegChannel();
}

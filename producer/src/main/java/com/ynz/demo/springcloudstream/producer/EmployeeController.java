package com.ynz.demo.springcloudstream.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class EmployeeController {
    private final EmployeeRegChannels source;

    @PostMapping("register")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        log.info(" create a new Employee ");

        source.employeeRegChannel().send(MessageBuilder.withPayload(employee).build());
        log.info("published register event");

        return ResponseEntity.ok(employee);
    }

}

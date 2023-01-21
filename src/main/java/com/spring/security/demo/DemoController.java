package com.spring.security.demo;

import com.spring.security.auth.AuthenticationController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);
    @GetMapping
    public ResponseEntity<String> sayHello(){

      logger.info("Demo");
        return  ResponseEntity.ok("Hello from Secured EndPoint");
    }

}

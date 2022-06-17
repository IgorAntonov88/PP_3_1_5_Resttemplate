package com.example.pp_3_1_5_resttemplate;

import com.example.pp_3_1_5_resttemplate.restClient.RestClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pp315TemplateApplication {

    public static void main(String[] args) {

        SpringApplication.run(Pp315TemplateApplication.class, args);
        System.out.println(RestClient.start());
    }

}

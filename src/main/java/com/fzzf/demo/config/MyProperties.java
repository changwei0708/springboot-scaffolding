package com.fzzf.demo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class MyProperties {

    @Value("${com.fzzf.title}")
    private String title;
    @Value("${com.fzzf.description}")
    private String description;
}

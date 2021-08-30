package com.example.api.oracle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class OracleController {
    @GetMapping("/")
    public String home() {
        return new SimpleDateFormat("yyy-MM-dd hh:mm:ss").format(new Date());
    }
}

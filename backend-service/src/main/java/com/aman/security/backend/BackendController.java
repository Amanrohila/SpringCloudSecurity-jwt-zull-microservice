package com.aman.security.backend;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A simple controller.
 *
 */
@RestController
public class BackendController {
	
	@Value("${aman.demo.value:default value}")
	String value;

    @GetMapping("/admin")
    public String admin() {
        return "Hello Admin!";
    }

    @GetMapping("/user")
    public String user() {
        return "Hello User!";
    }

    @GetMapping("/guest")
    public String guest() {
        return "Hello Guest! "+ value;
    }
    
    @GetMapping("/otherurl")
    public String otherurl() {
        return "Hello other url! "+ value;
    }
}


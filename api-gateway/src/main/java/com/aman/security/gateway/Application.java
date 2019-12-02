package com.aman.security.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Spring boot app.
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class Application {
	
    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}

package ua.edu.znu.cs.terms.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.znu.cs.terms.entities.Greeting;

@RestController

public class GreetingController {
    
    private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
    
    @GetMapping("/greeting")
    Greeting greeting(@RequestParam(defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}

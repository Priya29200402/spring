package com.xworkz.light.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TestComponent {
    public TestComponent() {
        System.out.println("Created TestComponent");
    }

    @RequestMapping("/submit")
    public String onSubmit() {
        System.out.println("Running onSubmit method");
        return "Test.jsp";
    }
}

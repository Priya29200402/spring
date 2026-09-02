package com.xworkz.coffee.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class XworkzSpringConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    public XworkzSpringConfig() {
        System.out.println("Created XworkzSpringConfig");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}

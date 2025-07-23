package com.xworkz.carrom.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class CarromInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {CarromConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/onSend","/name","/fruit","/hospital","/police","/rto"};
    }
}

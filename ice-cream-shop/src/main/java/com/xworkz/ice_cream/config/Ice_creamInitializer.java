package com.xworkz.ice_cream.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Ice_creamInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {Ice_creamConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/order"};
    }
}

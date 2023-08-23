package com.project.libraryManagement.config;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Questa classe consente di personalizzare le configurazioni di MVC, come la mappatura delle URL alle pagine HTML.
 * (pagina di login mappata a "/login")
 */
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }
}

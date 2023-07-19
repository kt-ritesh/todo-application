package org.app;

import org.app.entity.todo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class beanFac {
    @Bean
    public List<todo> getDataResource(){
        return new ArrayList<>();
    }
}

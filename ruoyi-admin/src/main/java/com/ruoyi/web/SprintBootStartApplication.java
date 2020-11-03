package com.ruoyi.web;
import com.ruoyi.RuoYiApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * Created by liliang on 2020/9/30.
 */
public class SprintBootStartApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(RuoYiApplication.class);
    }
}

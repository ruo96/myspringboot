package com.mystudy.myFirstSpringBootDemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Created by wrh
 * @Description:
 * @Date: Created in 下午 10:08 2017/9/28 0028
 * @Modified By:
 */
@Component
@ConfigurationProperties( prefix = "author")
@PropertySource("classpath:config/author.properties")
public class NewSettings {
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

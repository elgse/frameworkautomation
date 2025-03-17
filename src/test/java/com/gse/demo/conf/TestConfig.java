package com.gse.demo.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages="com.gse.demo")
@PropertySource("classpath:/application.properties")
public class TestConfig {

}

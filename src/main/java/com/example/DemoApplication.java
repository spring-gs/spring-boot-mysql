package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
//import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@ComponentScan("com.example")
public class DemoApplication  {
//public class DemoApplication extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println(SpringApplication.BANNER_LOCATION_PROPERTY);
	}

//	@Override
//	public void customize(ConfigurableEmbeddedServletContainer container) {
//		container.setPort(8081);
//	}
}

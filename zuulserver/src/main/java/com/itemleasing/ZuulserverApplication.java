package com.itemleasing;

import com.itemleasing.utils.UserContextInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;


// Note: @EnableZuulServer is used when you want to build your own routing service
@SpringBootApplication
@EnableZuulProxy
public class ZuulserverApplication {

	public RestTemplate getRestTemplate() {
		RestTemplate template = new RestTemplate();
		List interceptors = template.getInterceptors();

		if(interceptors == null) {
			template.setInterceptors(Collections.singletonList(new UserContextInterceptor()));
		} else {
			interceptors.add(new UserContextInterceptor());
			template.setInterceptors(interceptors);
		}

		return template;
	}

	public static void main(String[] args) {
		SpringApplication.run(ZuulserverApplication.class, args);
	}
}

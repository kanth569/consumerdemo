package com.java.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.java.consumer.mapper.ConsumerMapper;
import com.java.consumer.model.User;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

@ComponentScan(basePackages = { "com.java.consumer.controller" })
@EnableWebMvc
@Configuration
public class SpringMvcConfig {

	@SuppressWarnings("unused")
	@Bean
	public MapperFacade restServiceModelDomainMapperFacade() {

		MapperFactory restServiceModelDomainFactory = new DefaultMapperFactory.Builder().build();
		ConverterFactory converterFactory = restServiceModelDomainFactory.getConverterFactory();

		new ConsumerMapper(restServiceModelDomainFactory);
		return restServiceModelDomainFactory.getMapperFacade();
	}

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;

	}

	@Bean
	public User securitydemoGetById() throws Exception {
		final String uri = "http://localhost:4040/securitydemo/businessfunctions/1";

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<User> result = restTemplate.exchange(uri, HttpMethod.GET, entity, User.class);
		User user = null;
		if (result.getStatusCode() == HttpStatus.OK) {

			user = result.getBody();
		}

		System.out.println(result.getStatusCode());
		System.out.println(result.getBody());

		return user;
	}

}

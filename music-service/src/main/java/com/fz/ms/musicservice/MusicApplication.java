package com.fz.ms.musicservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;

@EnableFeignClients
@SpringBootApplication
public class MusicApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicApplication.class, args);
	}

	public ObjectMapper objectMapper() {
		return JsonMapper.builder() // or different mapper for other format
				.addModule(new ParameterNamesModule())//
				.addModule(new Jdk8Module())//
				.addModule(new JavaTimeModule())//
				// and possibly other configuration, modules, then:
				.build();
	}
}

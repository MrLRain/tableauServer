package com.adc.tableau.tableauSever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan("com.adc.tableau")
@EnableAutoConfiguration
@SpringBootApplication
@ServletComponentScan
public class TableauSeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(TableauSeverApplication.class, args);
	}

}


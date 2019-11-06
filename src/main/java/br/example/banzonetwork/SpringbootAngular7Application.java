package br.example.banzonetwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.example.banzonetwork.config.property.BanzoNetWorkProperty;

@SpringBootApplication
@EnableConfigurationProperties(BanzoNetWorkProperty.class)
public class SpringbootAngular7Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAngular7Application.class, args);
	}
}

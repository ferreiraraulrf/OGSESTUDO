package br.com.compasso.ogsestudo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "br.com.compasso.ogsestudo")
@EnableJpaAuditing
@EnableSwagger2
public class OgsestudoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OgsestudoApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}

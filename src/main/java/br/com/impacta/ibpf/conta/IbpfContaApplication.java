package br.com.impacta.ibpf.conta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class IbpfContaApplication {

	public static void main(String[] args) {

		SpringApplication.run(IbpfContaApplication.class, args);
	}

}

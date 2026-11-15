package org.j2os.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
//@ConditionalOnMissingBean
public class BankingRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingRestApiApplication.class, args);
	}

}

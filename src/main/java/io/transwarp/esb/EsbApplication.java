package io.transwarp.esb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "io.transwarp")
@EnableSwagger2
public class EsbApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsbApplication.class, args);
	}

}

package org.schhx.dubbolearnprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "org.schhx.dubbolearnprovider")
public class DubboLearnProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboLearnProviderApplication.class, args);
	}

}

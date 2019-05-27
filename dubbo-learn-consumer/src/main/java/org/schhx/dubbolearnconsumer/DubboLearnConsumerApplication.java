package org.schhx.dubbolearnconsumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@EnableDubbo(scanBasePackages = "org.schhx.dubbolearnconsumer")
public class DubboLearnConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboLearnConsumerApplication.class, args);
	}

}

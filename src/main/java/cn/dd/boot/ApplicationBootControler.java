package cn.dd.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "cn.dd" })
public class ApplicationBootControler {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationBootControler.class, args);
	}
}

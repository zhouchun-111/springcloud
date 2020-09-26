package com.springCloudApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;


@Configuration//配置控制    
@EnableAutoConfiguration//启用自动配置    
@SpringBootApplication
@EnableDiscoveryClient 
@ServletComponentScan
public class SpringCloudAppApplication {

	public static void main(String[] args) {
		System.out.println("》》》》》》》》");
		SpringApplication.run(SpringCloudAppApplication.class, args);
	}

}

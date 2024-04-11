package kr.co.dbinc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BackEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackEurekaserverApplication.class, args);
	}

}

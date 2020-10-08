package br.com.gustavopomponi.twitterposts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TwitterpostsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterpostsApplication.class, args);
	}

}

package br.com.gustavopomponi.gateway;

import br.com.gustavopomponi.gateway.config.UriConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class GatewayApplication {


	@Value("${api.twitter.host}")
	private String httpUri;

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

	@RequestMapping("/fallback")
	public Mono<String> fallback() {
		return Mono.just("fallback");
	}

	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {

		return builder.routes()
				.route(p -> p
						.path("/tweets")
						.uri(httpUri))
				.build();
	}
}

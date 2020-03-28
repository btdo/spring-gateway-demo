package com.example.gateway;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@EnableConfigurationProperties(UriConfiguration.class)
public class RouteConfiguration {

	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder, UriConfiguration uriConfiguration) {
		return builder.routes()
				.route(p -> p
						.header("pass-through")
						.uri(uriConfiguration.getHttpbin()))
				.route(p -> p.host("*.hystrix.com")
						.filters(f -> f.hystrix(config -> config.setName("mycmd").setFallbackUri("forward:/fallback")))
						.uri(uriConfiguration.getHttpbin()))
				.build();
	}
	
	@RequestMapping("/fallback")
	public Mono<String> fallback() {
	  return Mono.just("fallback");
	}
}


@ConfigurationProperties
class UriConfiguration {

  private String httpbin = "https://stg31.soa-gw.canadapost.ca";

  public String getHttpbin() {
    return httpbin;
  }

  public void setHttpbin(String httpbin) {
    this.httpbin = httpbin;
  }
}

package com.example.gateway;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import com.example.gateway.models.EligibilityRequest;
import com.example.gateway.models.EligibilityResponse;
import com.example.gateway.models.TrackAndEligibilityResponse;
import com.example.gateway.models.TrackResponse;

import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@RestController
public class TrackController {

	WebClient client = WebClient.builder().baseUrl("https://stg31.soa-gw.canadapost.ca")
			.defaultCookie("cookieKey", "cookieValue")
			.defaultHeader("Authorization", "Basic U09BR1dfaVBob25lVXNlcjohU09BR1dfaVBob25lVXNlciU=").build();

	@GetMapping("/track/json/package/{pin}/detail")
	@ResponseBody
	public Mono<TrackResponse> track(@PathVariable String pin) {
		WebClient.RequestBodySpec uri1 = client.method(HttpMethod.GET).uri(uriBuilder -> uriBuilder.path("/track/json/package/{pin}/detail").build(pin));		
		return uri1
				.header(HttpHeaders.CONTENT_TYPE, "application/vnd.cpc.track-v6+json;charset=utf-8").exchange()
				.flatMap(response -> response.bodyToMono(TrackResponse.class)).subscribeOn(Schedulers.elastic());
	}
	
	
	@PostMapping("/custexperience/elengine/json/eligibility")
	@ResponseBody
	public Mono<EligibilityResponse[]> eligibility(@RequestBody EligibilityRequest request) {
		WebClient.RequestBodySpec uri2 = client.method(HttpMethod.POST)
				.uri("/custexperience/elengine/json/eligibility");		
		return uri2
				.body(BodyInserters.fromValue(request))
				.header(HttpHeaders.ACCEPT, "application/vnd.cpc.elengine-v1+json")
				.header(HttpHeaders.CONTENT_TYPE, "application/vnd.cpc.elengine-v1+json").exchange()
				.flatMap(response -> response.bodyToMono(EligibilityResponse[].class)).subscribeOn(Schedulers.elastic());
	}
	
	@GetMapping("/track/{pin}/detail")
	@ResponseBody
	public Mono<TrackAndEligibilityResponse> combine(@PathVariable String pin) {		
		Mono<TrackResponse> trackResponse = track(pin);		
		Mono<EligibilityResponse[]> elMono = eligibility(new EligibilityRequest(pin));	
		
		return Mono.zip(trackResponse, elMono, TrackAndEligibilityResponse::new);
	}
	

}

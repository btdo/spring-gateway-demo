package com.example.gateway.models;

public class TrackAndEligibilityResponse {
	TrackResponse trackResponse;
	EligibilityResponse[] eligibilityResponse;
	
	public TrackAndEligibilityResponse(TrackResponse trackResponse, EligibilityResponse[] response) {
		this.trackResponse =  trackResponse;
		this.eligibilityResponse =  response;
	}

	public TrackResponse getTrackResponse() {
		return trackResponse;
	}

	public void setTrackResponse(TrackResponse trackResponse) {
		this.trackResponse = trackResponse;
	}

	public EligibilityResponse[] getEligibilityResponse() {
		return eligibilityResponse;
	}

	public void setEligibilityResponse(EligibilityResponse[] eligibilityResponse) {
		this.eligibilityResponse = eligibilityResponse;
	}
	
	
	
}

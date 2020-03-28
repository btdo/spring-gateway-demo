package com.example.gateway.models;

import java.util.ArrayList;
import java.util.List;

public class EligibilityRequest {
	List<String> pins;
	List<String> prefs;
	
	public EligibilityRequest (List<String> pins, List<String> prefs) {
		this.pins = pins;
		this.prefs = prefs;
	}
	
	public EligibilityRequest(String pin) {
		this.pins  = new ArrayList<String>(){/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{ add(pin);}};
		this.prefs = new ArrayList<String>();
	}
	
	public List<String> getPins() {
		return pins;
	}
	public void setPins(List<String> pins) {
		this.pins = pins;
	}
	public List<String> getPrefs() {
		return prefs;
	}
	public void setPrefs(List<String> prefs) {
		this.prefs = prefs;
	}
}

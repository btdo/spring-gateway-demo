package com.example.gateway.models;

import java.util.List;


/**
 * @author bao
 *
 */


public class EligibilityResponse {
	private String pref;

    private List<String> eligiblePins;

    private List<FailedPins> failedPins;

    public void setPref(String pref){
        this.pref = pref;
    }
    public String getPref(){
        return this.pref;
    }
    public void setEligiblePins(List<String> eligiblePins){
        this.eligiblePins = eligiblePins;
    }
    public List<String> getEligiblePins(){
        return this.eligiblePins;
    }
    public void setFailedPins(List<FailedPins> failedPins){
        this.failedPins = failedPins;
    }
    public List<FailedPins> getFailedPins(){
        return this.failedPins;
    }
}

class FailedPins
{
    private String pin;

    private String failedRule;

    public void setPin(String pin){
        this.pin = pin;
    }
    public String getPin(){
        return this.pin;
    }
    public void setFailedRule(String failedRule){
        this.failedRule = failedRule;
    }
    public String getFailedRule(){
        return this.failedRule;
    }
}

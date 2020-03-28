package com.example.gateway.models;

import java.util.List;

public class TrackResponse {
	private String pin;

    private String productNmEn;

    private String productNmFr;

    private String productNbr;

    private List<DeliveryOptions> deliveryOptions;

    private String status;

    private String acceptedDate;

    private String customsAmtDue;

    private List<Events> events;

    private String addtnlDestInfo;

    private boolean suppressSignature;

    private boolean lagTime;

    private boolean returnPinIndicator;

    private boolean refundAllowed;

    private String cuPin;

    private boolean dtcBarcode;

    private boolean canadianDest;

    private String dlvryInstruction;

    private boolean sigReqByAmtDue;

    public void setPin(String pin){
        this.pin = pin;
    }
    public String getPin(){
        return this.pin;
    }
    public void setProductNmEn(String productNmEn){
        this.productNmEn = productNmEn;
    }
    public String getProductNmEn(){
        return this.productNmEn;
    }
    public void setProductNmFr(String productNmFr){
        this.productNmFr = productNmFr;
    }
    public String getProductNmFr(){
        return this.productNmFr;
    }
    public void setProductNbr(String productNbr){
        this.productNbr = productNbr;
    }
    public String getProductNbr(){
        return this.productNbr;
    }
    public void setDeliveryOptions(List<DeliveryOptions> deliveryOptions){
        this.deliveryOptions = deliveryOptions;
    }
    public List<DeliveryOptions> getDeliveryOptions(){
        return this.deliveryOptions;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
    public void setAcceptedDate(String acceptedDate){
        this.acceptedDate = acceptedDate;
    }
    public String getAcceptedDate(){
        return this.acceptedDate;
    }
    public void setCustomsAmtDue(String customsAmtDue){
        this.customsAmtDue = customsAmtDue;
    }
    public String getCustomsAmtDue(){
        return this.customsAmtDue;
    }
    public void setEvents(List<Events> events){
        this.events = events;
    }
    public List<Events> getEvents(){
        return this.events;
    }
    public void setAddtnlDestInfo(String addtnlDestInfo){
        this.addtnlDestInfo = addtnlDestInfo;
    }
    public String getAddtnlDestInfo(){
        return this.addtnlDestInfo;
    }
    public void setSuppressSignature(boolean suppressSignature){
        this.suppressSignature = suppressSignature;
    }
    public boolean getSuppressSignature(){
        return this.suppressSignature;
    }
    public void setLagTime(boolean lagTime){
        this.lagTime = lagTime;
    }
    public boolean getLagTime(){
        return this.lagTime;
    }
    public void setReturnPinIndicator(boolean returnPinIndicator){
        this.returnPinIndicator = returnPinIndicator;
    }
    public boolean getReturnPinIndicator(){
        return this.returnPinIndicator;
    }
    public void setRefundAllowed(boolean refundAllowed){
        this.refundAllowed = refundAllowed;
    }
    public boolean getRefundAllowed(){
        return this.refundAllowed;
    }
    public void setCuPin(String cuPin){
        this.cuPin = cuPin;
    }
    public String getCuPin(){
        return this.cuPin;
    }
    public void setDtcBarcode(boolean dtcBarcode){
        this.dtcBarcode = dtcBarcode;
    }
    public boolean getDtcBarcode(){
        return this.dtcBarcode;
    }
    public void setCanadianDest(boolean canadianDest){
        this.canadianDest = canadianDest;
    }
    public boolean getCanadianDest(){
        return this.canadianDest;
    }
    public void setDlvryInstruction(String dlvryInstruction){
        this.dlvryInstruction = dlvryInstruction;
    }
    public String getDlvryInstruction(){
        return this.dlvryInstruction;
    }
    public void setSigReqByAmtDue(boolean sigReqByAmtDue){
        this.sigReqByAmtDue = sigReqByAmtDue;
    }
    public boolean getSigReqByAmtDue(){
        return this.sigReqByAmtDue;
    }
}

class Datetime
{
    private String date;

    private String time;

    private String zoneOffset;

    public void setDate(String date){
        this.date = date;
    }
    public String getDate(){
        return this.date;
    }
    public void setTime(String time){
        this.time = time;
    }
    public String getTime(){
        return this.time;
    }
    public void setZoneOffset(String zoneOffset){
        this.zoneOffset = zoneOffset;
    }
    public String getZoneOffset(){
        return this.zoneOffset;
    }
}

class LocationAddr
{
    private String countryCd;

    private String countryNmEn;

    private String countryNmFr;

    private String city;

    private String regionCd;

    public void setCountryCd(String countryCd){
        this.countryCd = countryCd;
    }
    public String getCountryCd(){
        return this.countryCd;
    }
    public void setCountryNmEn(String countryNmEn){
        this.countryNmEn = countryNmEn;
    }
    public String getCountryNmEn(){
        return this.countryNmEn;
    }
    public void setCountryNmFr(String countryNmFr){
        this.countryNmFr = countryNmFr;
    }
    public String getCountryNmFr(){
        return this.countryNmFr;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return this.city;
    }
    public void setRegionCd(String regionCd){
        this.regionCd = regionCd;
    }
    public String getRegionCd(){
        return this.regionCd;
    }
}

class DeliveryOptions
{
    private String cd;

    private String compliance;

    private String descEn;

    private String descFr;

    public void setCd(String cd){
        this.cd = cd;
    }
    public String getCd(){
        return this.cd;
    }
    public void setCompliance(String compliance){
        this.compliance = compliance;
    }
    public String getCompliance(){
        return this.compliance;
    }
    public void setDescEn(String descEn){
        this.descEn = descEn;
    }
    public String getDescEn(){
        return this.descEn;
    }
    public void setDescFr(String descFr){
        this.descFr = descFr;
    }
    public String getDescFr(){
        return this.descFr;
    }
}

class Events
{
    private String cd;

    private String webCd;

    private Datetime datetime;

    private LocationAddr locationAddr;

    private String descEn;

    private String descFr;

    private String type;

    public void setCd(String cd){
        this.cd = cd;
    }
    public String getCd(){
        return this.cd;
    }
    public void setWebCd(String webCd){
        this.webCd = webCd;
    }
    public String getWebCd(){
        return this.webCd;
    }
    public void setDatetime(Datetime datetime){
        this.datetime = datetime;
    }
    public Datetime getDatetime(){
        return this.datetime;
    }
    public void setLocationAddr(LocationAddr locationAddr){
        this.locationAddr = locationAddr;
    }
    public LocationAddr getLocationAddr(){
        return this.locationAddr;
    }
    public void setDescEn(String descEn){
        this.descEn = descEn;
    }
    public String getDescEn(){
        return this.descEn;
    }
    public void setDescFr(String descFr){
        this.descFr = descFr;
    }
    public String getDescFr(){
        return this.descFr;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
}


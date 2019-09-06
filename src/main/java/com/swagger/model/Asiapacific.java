package com.swagger.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"accountNum",
"isActive"
})
public class Asiapacific {

	@JsonProperty("accountname")
	private String accountname;	
	@JsonProperty("createddate")
	private Date createddate;	
@JsonProperty("accountNum")
private int accountNum;
@JsonProperty("isActive")
private boolean isActive;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("accountNum")
public int getAccountNum() {
return accountNum;
}

@JsonProperty("accountNum")
public void setAccountNum(int accountNum) {
this.accountNum = accountNum;
}

@JsonProperty("createddate")
public Date getCreateddate() {
return createddate;
}

@JsonProperty("createddate")
public void setCreateddate(Date createddate) {
this.createddate = createddate;
}

@JsonProperty("accountname")
public String getAccountname() {
return accountname;
}

@JsonProperty("accountname")
public void setAccountname(String accountname) {
this.accountname = accountname;
}

@JsonProperty("isActive")
public boolean getIsActive() {
return isActive;
}

@JsonProperty("isActive")
public void setIsActive(boolean isActive) {
this.isActive = isActive;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}

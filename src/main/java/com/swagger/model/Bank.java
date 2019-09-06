package com.swagger.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"accountCreatedby",
"registeredBranch",
"domesticAccountDetails",
"internationalAccount",
"internationalAccDetails"
})
public class Bank {

@JsonProperty("accountCreatedby")
private String accountCreatedby;
@JsonProperty("registeredBranch")
private String registeredBranch;
@JsonProperty("domesticAccountDetails")
private List<DomesticAccountDetail> domesticAccountDetails = null;
@JsonProperty("internationalAccount")
private InternationalAccount internationalAccount;
@JsonProperty("internationalAccDetails")
private List<InternationalAccDetail> internationalAccDetails = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("accountCreatedby")
public String getAccountCreatedby() {
return accountCreatedby;
}

@JsonProperty("accountCreatedby")
public void setAccountCreatedby(String accountCreatedby) {
this.accountCreatedby = accountCreatedby;
}

@JsonProperty("registeredBranch")
public String getRegisteredBranch() {
return registeredBranch;
}

@JsonProperty("registeredBranch")
public void setRegisteredBranch(String registeredBranch) {
this.registeredBranch = registeredBranch;
}

@JsonProperty("domesticAccountDetails")
public List<DomesticAccountDetail> getDomesticAccountDetails() {
return domesticAccountDetails;
}

@JsonProperty("domesticAccountDetails")
public void setDomesticAccountDetails(List<DomesticAccountDetail> domesticAccountDetails) {
this.domesticAccountDetails = domesticAccountDetails;
}

@JsonProperty("internationalAccount")
public InternationalAccount getInternationalAccount() {
return internationalAccount;
}

@JsonProperty("internationalAccount")
public void setInternationalAccount(InternationalAccount internationalAccount) {
this.internationalAccount = internationalAccount;
}

@JsonProperty("internationalAccDetails")
public List<InternationalAccDetail> getInternationalAccDetails() {
return internationalAccDetails;
}

@JsonProperty("internationalAccDetails")
public void setInternationalAccDetails(List<InternationalAccDetail> internationalAccDetails) {
this.internationalAccDetails = internationalAccDetails;
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

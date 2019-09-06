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
"accountNo",
"accountname",
"credit",
"debit"
})
public class DomesticAccountDetail {

@JsonProperty("accountNo")
private int accountNo;
@JsonProperty("accountname")
private String accountname;
@JsonProperty("creditdate")
private Date creditdate;
@JsonProperty("debitdate")
private Date debitdate;
@JsonProperty("status")
private boolean status;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("accountNo")
public int getAccountNo() {
return accountNo;
}

@JsonProperty("accountNo")
public void setAccountNo(int accountNo) {
this.accountNo = accountNo;
}

@JsonProperty("status")
public boolean getStatus() {
return status;
}

@JsonProperty("status")
public void setStatus(boolean status) {
this.status = status;
}

@JsonProperty("accountname")
public String getAccountname() {
return accountname;
}

@JsonProperty("accountname")
public void setAccountname(String accountname) {
this.accountname = accountname;
}

@JsonProperty("creditdate")
public Date getCreditdate() {
return creditdate;
}

@JsonProperty("creditdate")
public void setCreditdate(Date creditdate) {
this.creditdate = creditdate;
}

@JsonProperty("debitdate")
public Date getDebitdate() {
return debitdate;
}

@JsonProperty("debitdate")
public void setDebit(Date debitdate) {
this.debitdate = debitdate;
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
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
public class InternationalAccDetail {

@JsonProperty("accountNo")
private int accountNo;
@JsonProperty("accountname")
private String accountname;
@JsonProperty("credit")
private Date credit;
@JsonProperty("debit")
private Date debit;
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

@JsonProperty("accountname")
public String getAccountname() {
return accountname;
}

@JsonProperty("status")
public void setStatus(boolean status) {
this.status = status;
}

@JsonProperty("status")
public boolean getStatus() {
return status;
}

@JsonProperty("accountname")
public void setAccountname(String accountname) {
this.accountname = accountname;
}

@JsonProperty("credit")
public Date getCredit() {
return credit;
}

@JsonProperty("credit")
public void setCredit(Date credit) {
this.credit = credit;
}

@JsonProperty("debit")
public Date getDebit() {
return debit;
}

@JsonProperty("debit")
public void setDebit(Date debit) {
this.debit = debit;
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
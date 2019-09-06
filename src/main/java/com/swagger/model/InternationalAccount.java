package com.swagger.model;

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
"asiapacific",
"europe",
"us"
})
public class InternationalAccount {

@JsonProperty("asiapacific")
private Asiapacific asiapacific;
@JsonProperty("europe")
private Europe europe;
@JsonProperty("us")
private Us us;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("asiapacific")
public Asiapacific getAsiapacific() {
return asiapacific;
}

@JsonProperty("asiapacific")
public void setAsiapacific(Asiapacific asiapacific) {
this.asiapacific = asiapacific;
}

@JsonProperty("europe")
public Europe getEurope() {
return europe;
}

@JsonProperty("europe")
public void setEurope(Europe europe) {
this.europe = europe;
}

@JsonProperty("us")
public Us getUs() {
return us;
}

@JsonProperty("us")
public void setUs(Us us) {
this.us = us;
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

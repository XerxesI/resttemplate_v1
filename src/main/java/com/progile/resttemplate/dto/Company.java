
package com.progile.resttemplate.dto;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "catchPhrase",
    "bs"
})
@Generated("jsonschema2pojo")
@Embeddable
public class Company {

    @JsonProperty("name")
    private String cname;
    @JsonProperty("catchPhrase")
    private String catchPhrase;
    @JsonProperty("bs")
    private String bs;
    @JsonIgnore
    @Transient
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return cname;
    }

    @JsonProperty("name")
    public void setName(String cname) {
        this.cname = cname;
    }

    @JsonProperty("catchPhrase")
    public String getCatchPhrase() {
        return catchPhrase;
    }

    @JsonProperty("catchPhrase")
    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    @JsonProperty("bs")
    public String getBs() {
        return bs;
    }

    @JsonProperty("bs")
    public void setBs(String bs) {
        this.bs = bs;
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

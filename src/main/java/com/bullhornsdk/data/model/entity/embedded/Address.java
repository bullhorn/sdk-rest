package com.bullhornsdk.data.model.entity.embedded;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author magnus.palm
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address extends AbstractEntity {

    private String address1;

    private String address2;

    private String city;

    @JsonIgnore
    private String state;

    private Integer stateID;

    private String zip;

    private Integer countryID;
    
    private String countryName;

    @JsonProperty("address1")
    public String getAddress1() {
        return address1;
    }

    @JsonProperty("address1")
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @JsonProperty("address2")
    public String getAddress2() {
        return address2;
    }

    @JsonProperty("address2")
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonIgnore
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("stateID")
    public Integer getStateID() {
        return stateID;
    }

    public void setStateID(Integer stateID) {
        this.stateID = stateID;
    }

    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    @JsonProperty("countryID")
    public Integer getCountryID() {
        return countryID;
    }

    @JsonProperty("countryID")
    public void setCountryID(Integer countryID) {
        this.countryID = countryID;
    }

    @JsonProperty("countryName")
    public String getCountryName() {
        return countryName;
    }

    @JsonProperty("countryName")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Address instantiateForInsert() {
        Address address = new Address();
        address.setAddress1("123 Main St");
        address.setCity("St Louis");
        address.setState("MO");
        address.setZip("1234563");
        return address;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address1 == null) ? 0 : address1.hashCode());
        result = prime * result + ((address2 == null) ? 0 : address2.hashCode());
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((countryID == null) ? 0 : countryID.hashCode());
        result = prime * result + ((state == null) ? 0 : state.hashCode());
        result = prime * result + ((stateID == null) ? 0 : stateID.hashCode());
        result = prime * result + ((zip == null) ? 0 : zip.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (address1 != null ? !address1.equals(address.address1) : address.address1 != null) return false;
        if (address2 != null ? !address2.equals(address.address2) : address.address2 != null) return false;
        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        if (state != null ? !state.equals(address.state) : address.state != null) return false;
        if (stateID != null ? !stateID.equals(address.stateID) : address.stateID != null) return false;
        if (zip != null ? !zip.equals(address.zip) : address.zip != null) return false;
        if (countryID != null ? !countryID.equals(address.countryID) : address.countryID != null) return false;
        return countryName != null ? countryName.equals(address.countryName) : address.countryName == null;
    }

    @Override
    public String toString() {
        return "Address{" +
            "address1='" + address1 + '\'' +
            ", address2='" + address2 + '\'' +
            ", city='" + city + '\'' +
            ", state='" + state + '\'' +
            ", stateID='" + stateID + '\'' +
            ", zip='" + zip + '\'' +
            ", countryID=" + countryID + '\'' +
            ", countryName='" + countryName + '\'' +
            '}';
    }
}

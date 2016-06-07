package com.bullhornsdk.data.model.entity.embedded;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * 
 * @author magnus.palm
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "address1", "address2", "city", "state", "zip", "countryID" })
public class Address extends AbstractEntity {

    private String address1;

    private String address2;

    private String city;

    @JsonIgnore
    private String state;

    private String zip;

    private Integer countryID;

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address1 == null) ? 0 : address1.hashCode());
        result = prime * result + ((address2 == null) ? 0 : address2.hashCode());
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((countryID == null) ? 0 : countryID.hashCode());
        result = prime * result + ((state == null) ? 0 : state.hashCode());
        result = prime * result + ((zip == null) ? 0 : zip.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Address other = (Address) obj;
        if (address1 == null) {
            if (other.address1 != null)
                return false;
        } else if (!address1.equals(other.address1))
            return false;
        if (address2 == null) {
            if (other.address2 != null)
                return false;
        } else if (!address2.equals(other.address2))
            return false;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        if (countryID == null) {
            if (other.countryID != null)
                return false;
        } else if (!countryID.equals(other.countryID))
            return false;
        if (state == null) {
            if (other.state != null)
                return false;
        } else if (!state.equals(other.state))
            return false;
        if (zip == null) {
            if (other.zip != null)
                return false;
        } else if (!zip.equals(other.zip))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" {\naddress1=");
        builder.append(address1);
        builder.append(", \naddress2=");
        builder.append(address2);
        builder.append(", \ncity=");
        builder.append(city);
        builder.append(", \nstate=");
        builder.append(state);
        builder.append(", \nzip=");
        builder.append(zip);
        builder.append(", \ncountryID=");
        builder.append(countryID);
        builder.append("\n}");
        return builder.toString();
    }

    public Address instantiateForInsert() {
        Address address = new Address();
        address.setAddress1("123 Main St");
        address.setCity("St Louis");
        address.setState("MO");
        address.setZip("1234563");
        return address;
    }

}

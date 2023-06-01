package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.math.BigDecimal;
import java.util.Objects;

@JsonRootName("data")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CandidateSource extends AbstractEntity implements QueryEntity, UpdateEntity {
    private Integer id;
    private String accountNumber;
    private Address address;
    private Candidate candidate;
    private Corporation corporation;
    private String fax;
    private BigDecimal fee;
    private String feeType;
    private String migrateGUID;
    private String name;
    private String phone;
    private String type;

    public CandidateSource() {
    }

    public Integer getId() {
        return this.id;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public Address getAddress() {
        return this.address;
    }

    public Candidate getCandidate() {
        return this.candidate;
    }

    public Corporation getCorporation() {
        return this.corporation;
    }

    public String getFax() {
        return this.fax;
    }

    public BigDecimal getFee() {
        return this.fee;
    }

    public String getFeeType() {
        return this.feeType;
    }

    public String getMigrateGUID() {
        return this.migrateGUID;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getType() {
        return this.type;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public void setCorporation(Corporation corporation) {
        this.corporation = corporation;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public void setMigrateGUID(String migrateGUID) {
        this.migrateGUID = migrateGUID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "CandidateSource(id=" + this.getId() + ", accountNumber=" + this.getAccountNumber() + ", address=" + this.getAddress() + ", candidate=" + this.getCandidate() + ", corporation=" + this.getCorporation() + ", fax=" + this.getFax() + ", fee=" + this.getFee() + ", feeType=" + this.getFeeType() + ", migrateGUID=" + this.getMigrateGUID() + ", name=" + this.getName() + ", phone=" + this.getPhone() + ", type=" + this.getType() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CandidateSource that = (CandidateSource) o;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(accountNumber, that.accountNumber))
            return false;
        if (!Objects.equals(address, that.address)) return false;
        if (!Objects.equals(candidate, that.candidate)) return false;
        if (!Objects.equals(corporation, that.corporation)) return false;
        if (!Objects.equals(fax, that.fax)) return false;
        if (!Objects.equals(fee, that.fee)) return false;
        if (!Objects.equals(feeType, that.feeType)) return false;
        if (!Objects.equals(migrateGUID, that.migrateGUID)) return false;
        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(phone, that.phone)) return false;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (accountNumber != null ? accountNumber.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (candidate != null ? candidate.hashCode() : 0);
        result = 31 * result + (corporation != null ? corporation.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (fee != null ? fee.hashCode() : 0);
        result = 31 * result + (feeType != null ? feeType.hashCode() : 0);
        result = 31 * result + (migrateGUID != null ? migrateGUID.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}

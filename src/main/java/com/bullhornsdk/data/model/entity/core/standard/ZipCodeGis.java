package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("data")
public class ZipCodeGis extends AbstractEntity implements QueryEntity {
    private Integer id;
    private String areaCode;
    private String city;
    private Integer countryID;
    private BigDecimal latitude;
    private BigDecimal latitudeActual;
    private BigDecimal longitude;
    private BigDecimal longitudeActual;
    private String state;
}

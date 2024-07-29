package com.bullhornsdk.data.model.parameter.standard;

import com.bullhornsdk.data.model.parameter.EntityParams;
import lombok.Data;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

@Data
public class StandardEntityParams implements EntityParams {

    private Boolean showEditable;
    private LocalDate effectiveOn;

    private StandardEntityParams() {
        super();
        this.showEditable = false;
    }

    public static StandardEntityParams getInstance() {
        StandardEntityParams params = new StandardEntityParams();
        return params;
    }

    @Override
    public String getUrlString() {
        StringBuilder url = new StringBuilder();

        if (showEditable) {
            url.append("&showEditable={showEditable}");
        }

        if (effectiveOn != null) {
            url.append("&effectiveOn={effectiveOn}");
        }

        return url.toString();
    }

    @Override
    public Map<String, String> getParameterMap() {
        Map<String, String> uriVariables = new LinkedHashMap<String, String>();

        if (showEditable) {
            uriVariables.put("showEditable", "" + true);
        }

        if (effectiveOn != null) {
            uriVariables.put("effectiveOn", effectiveOn.toString());
        }

        return uriVariables;
    }

}

package com.bullhornsdk.data.model.parameter.standard;

import java.util.LinkedHashMap;
import java.util.Map;

import com.bullhornsdk.data.model.parameter.AssociationParams;

public class StandardAssociationParams implements AssociationParams {

    private boolean showEditable;

    private Integer count;

    private Integer start;

    private String orderBy;

    private StandardAssociationParams() {
        super();

        this.showEditable = false;
        this.count = null;
        this.start = null;
        this.orderBy = null;
    }

    public static StandardAssociationParams getInstance() {
        StandardAssociationParams params = new StandardAssociationParams();

        return params;
    }

    
    public void setShowEditable(boolean showEditable) {
        this.showEditable = showEditable;

    }

    @Override
    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public void setStart(Integer start) {
        this.start = start;
    }

    @Override
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    @Override
    public String getUrlString() {
        StringBuilder url = new StringBuilder();

        if (showEditable != false) {
            url.append("&showEditable={showEditable}");
        }
        if (count != null) {
            url.append("&count={count}");
        }
        if (start != null) {
            url.append("&start={start}");
        }
        if (orderBy != null) {
            url.append("&orderBy={orderBy}");
        }

        return url.toString();
    }

    @Override
    public Map<String, String> getParameterMap() {
        Map<String, String> uriVariables = new LinkedHashMap<String, String>();

        if (showEditable != false) {
            uriVariables.put("showEditable", "" + showEditable);
        }
        if (count != null) {
            uriVariables.put("count", "" + count);

        }
        if (start != null) {
            uriVariables.put("start", "" + start);
        }
        if (orderBy != null) {
            uriVariables.put("orderBy", orderBy);
        }

        return uriVariables;
    }

}

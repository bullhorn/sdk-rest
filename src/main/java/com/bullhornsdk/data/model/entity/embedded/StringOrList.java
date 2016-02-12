package com.bullhornsdk.data.model.entity.embedded;

import java.util.List;

public class StringOrList {

    private String string;

    private List<String> list;

    public String getString() {
        return string;
    }

    
    public void setString(String string) {
        this.string = string;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

}

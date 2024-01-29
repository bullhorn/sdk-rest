package com.bullhornsdk.data.api.helper.json.replaceall;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class ReplaceAllModule extends SimpleModule {
    public ReplaceAllModule() {
        addSerializer((Class<OneToMany<? extends BullhornEntity>>) (Class<?>) OneToMany.class, new ReplaceAllSerializer());
    }

    public String getModuleName() {
        return this.getClass().getSimpleName();
    }

    public int hashCode() {
        return this.getClass().hashCode();
    }

    public boolean equals(Object o) {
        return this == o;
    }
}

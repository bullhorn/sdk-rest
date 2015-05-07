package com.bullhornsdk.data.model.entity.meta;

import java.util.List;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

/**
 * Represents entity and property metadata.
 * 
 * @author magnus.palm
 * 
 */
public interface MetaData<T extends BullhornEntity> {

    /**
     * Returns the entity name
     * 
     * @return
     */
    public String getEntity();

    /**
     * Returns the url used to get the meta data
     * 
     * @return
     */
    public String getEntityMetaUrl();

    /**
     * Retuns the field label name for this entity
     * 
     * @return
     */
    public String getLabel();

    /**
     * Returns the field maps for the entity
     * 
     * @return
     */
    public List<Field> getFields();

    /**
     * Returns the Field with the specified name.
     * 
     * @param fieldName
     * @return
     */
    public Field getField(String fieldName);

}

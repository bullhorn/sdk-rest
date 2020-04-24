package com.bullhornsdk.data.model.entity.core.type;

/**
 * Represents a sub type of a BullhornEntity that can change versions over time.
 * All values on the entity can be set to where they will automatically switch
 * to a new value when in a new date range.
 *
 * effectiveDate is required, and effectiveEndDate cannot be set by the user,
 * the end date is a calculated field based on the effective dates of the versions.
 *
 * An update to the entity is actually a new insert of a version of that entity
 * and the current flattened entity is provided when reading the values of the entity.
 */
public interface EffectiveDateEntity extends BullhornEntity {

    public String getEffectiveDate();

    public String getEffectiveEndDate();
}

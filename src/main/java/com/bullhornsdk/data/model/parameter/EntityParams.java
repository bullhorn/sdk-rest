package com.bullhornsdk.data.model.parameter;

import java.time.LocalDate;

/**
 * Optional parameters for the "entity" api call.
 *
 * @author magnus.palm
 */
public interface EntityParams extends RequestParameters {

    /**
     * Returns whether to show the _editable field in responses.
     *
     * @return the flag value
     */
    Boolean getShowEditable();

    /**
     * Whether to show the _editable field in responses. The _editable field indicates whether an entity is editable.
     * Setting showEditable to true results in slower performance; use this setting sparingly and only when needed.
     *
     * @param showEditable the flag value
     */
    void setShowEditable(Boolean showEditable);

    /**
     * Returns the date limitation query on an effective-dated entity.
     *
     * @return The date limit
     */
    LocalDate getEffectiveOn();

    /**
     * Limit the request to a specific date. Only works on <a href=https://bullhorn.github.io/rest-api-docs/index.html#effective-dated-entity>Effective-Dated entities</a>
     *
     * @param effectiveOn The date limitation
     */
    void setEffectiveOn(LocalDate effectiveOn);
}

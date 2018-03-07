package com.bullhornsdk.data.model.parameter;

/**
 * Optional parameters for the "query" api call.
 *
 * @author magnus.palm
 */
public interface StateOptionParams extends OptionParams {

    /**
     * Optional “country” to restrict to states within that country, two-character ISO country code. Only one
     * country may be selected for each call.
     */
    public String getCountry();

    /**
     * Optional “country” to restrict to states within that country, two-character ISO country code. Only one
     * country may be selected for each call.
     *
     * @param country
     */
    public void setCountry(String country);

}

package com.bullhornsdk.data.model.parameter;

import com.bullhornsdk.data.model.enums.MetaParameter;

/**
 * Optional parameters for the "meta" api call.
 * 
 * @author magnus.palm
 * 
 */
public interface MetaParams extends RequestParameters {
	/**
	 * basic, or full. Returns metadata that describes the structure of returned entity data. Defaults to MetaParameter.BASIC.
	 * 
	 * @param metaParameter
	 */
	public void setMeta(MetaParameter metaParameter);
}

package com.bullhornsdk.data.api.helper;

import com.bullhornsdk.data.model.enums.BhRestEnvironment;


/**
 * Used to capture RestCredentials in the case of multi-tenant apps. Can be used in RestApiSession as an alternative way of instantiating a
 * session.
 * 
 * @author Magnus Fiore Palm
 * 
 */
public interface RestCredentials extends Entity<String> {

	/**
	 * Unique identifier for this particular rest credentials
	 */
	public String getId();

	public void setId(String id);

	/**
	 * Returns the corporation id that these credentials relate to
	 * 
	 * @return
	 */
	public Integer getCorporationId();

	public void setCorporationId(Integer corporationId);

	/**
	 * Returns the corporation name that these credentials relate to
	 * 
	 * @return
	 */
	public String getCorporationName();

	public void setCorporationName(String corporationName);

	/**
	 * Api key for the corporation. This will not be used to create the actual rest session, but is used for secondary security.
	 * 
	 * @return
	 */
	public String getApiKey();

	public void setApiKey(String apiKey);

	/**
	 * The bullhorn user name for creating the rest session
	 * 
	 * @return
	 */
	public String getBhUserName();

	public void setBhUserName(String bhUserName);

	/**
	 * Bullhorn Password for the bhUserName, also used for creating the rest sesssion.
	 * 
	 * @return
	 */
	public String getBhPassword();

	public void setBhPassword(String bhPassword);

	/**
	 * Used to login to get access the orca service
	 * 
	 * @return
	 */
	public String getUserName();

	public void setUserName(String orcaUserName);

	/**
	 * Used in conjunction with the orcaUserName to login to the Orca servce.
	 * 
	 * @return
	 */
	public String getPassword();

	public void setPassword(String orcaPassword);

	/**
	 * Determines what particular entities this RestCredential can access
	 * 
	 * @return
	 */
	public String getEntitlements();

	public void setEntitlements(String entitlements);

	public BhRestEnvironment getBhRestEnvironment();

	public void setBhRestEnvironment(BhRestEnvironment bhRestEnvironment);

	public String getDescription();

	public void setDescription(String description);

}

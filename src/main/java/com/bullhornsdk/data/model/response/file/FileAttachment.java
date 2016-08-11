package com.bullhornsdk.data.model.response.file;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;

/**
 * Contains both the file content as well as FileMeta data about the file.
 * 
 * @author magnus.palm
 * 
 */
public interface FileAttachment {

	/**
	 * The id of the file in BH
	 * 
	 * @return
	 */
	public Integer getId();

	// TODO refactor this to handle generic bullhorn entity if adding attachments for other entities
	public Candidate getCandidate();

	public String getContentSubType();

	public String getContentType();

	public DateTime getDateAdded();

	public String getDescription();

	public String getDirectory();

	public String getExternalID();

	public String getFileExtension();

	public String getFileSize();

	public String getIsCopied();

	public String getIsDeleted();

	public String getIsOpen();

	public String getIsSendOut();

	public String getName();

	public String getType();

	public String getUuid();

}

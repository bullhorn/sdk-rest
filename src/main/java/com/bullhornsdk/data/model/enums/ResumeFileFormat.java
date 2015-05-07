package com.bullhornsdk.data.model.enums;

/**
 * Allowed file formats for resume parsing.
 * 
 * @author magnus.palm
 * 
 */
public enum ResumeFileFormat {

	TEXT("text", "txt"), 
	HTML("html", "html"), 
	PDF("pdf", "pdf"), 
	DOC("doc", "doc"), 
	DOCX("docx", "docx"), 
	RTF("rtf", "rtf"), 
	ODT("odt", "odt");

	private final String urlParameterName;
	private final String fileFormat;

	private ResumeFileFormat(String urlParameterName, String fileFormat) {
		this.urlParameterName = urlParameterName;
		this.fileFormat = fileFormat;
	}

	public String getUrlParameterName() {
		return urlParameterName;
	}

	public String getFileFormat() {
		return fileFormat;
	}
	
	public static String fileFormatToUrlParam(String fileFormat){
		for (ResumeFileFormat c : ResumeFileFormat.values()) {
			if (c.getFileFormat().equals(fileFormat)) {
				return c.getUrlParameterName();
			}
		}

		throw new IllegalArgumentException("Not a valid fileFormat:"+fileFormat);
	}

	public static boolean isValidFormat(String fileFormat) {

		for (ResumeFileFormat c : ResumeFileFormat.values()) {
			if (c.getFileFormat().equals(fileFormat)) {
				return true;
			}
		}

		return false;
	}

}

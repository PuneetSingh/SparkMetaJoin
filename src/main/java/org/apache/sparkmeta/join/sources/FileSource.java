package org.apache.sparkmeta.join.sources;

import java.util.ArrayList;

import org.apache.sparkmeta.join.constants.SourceType;

public class FileSource extends Source {

	private String fileName;
	private String fileLocation;
	private boolean hasHeader;
	private ArrayList<String> headers;
	
	public FileSource() {
		super(SourceType.FILE);
	}
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileLocation() {
		return fileLocation;
	}
	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}
	public boolean isHasHeader() {
		return hasHeader;
	}
	public void setHasHeader(boolean hasHeader) {
		this.hasHeader = hasHeader;
	}
	public ArrayList<String> getHeaders() {
		return headers;
	}
	public void setHeaders(ArrayList<String> headers) {
		this.headers = headers;
	}
}

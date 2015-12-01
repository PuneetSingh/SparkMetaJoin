package org.apache.sparkmeta.join.vo;

import org.apache.sparkmeta.join.constants.SourceType;

public class SourceMeta {

	private SourceType sourceType;
	
	// File meta data
	private String fileName;
	private String filePath;
	private boolean fileHasHeader;
	
	// Cassandra
	private String cassandraKeyspace;
	private String cassandraTablename;

	public SourceType getSourceType() {
		return sourceType;
	}

	public void setSourceType(SourceType sourceType) {
		this.sourceType = sourceType;
	}
}

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
	
	//Database
	private String hostName;
	private String port;
	private String database;
	private String table;

	public SourceType getSourceType() {
		return sourceType;
	}

	public void setSourceType(SourceType sourceType) {
		this.sourceType = sourceType;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public boolean isFileHasHeader() {
		return fileHasHeader;
	}

	public void setFileHasHeader(boolean fileHasHeader) {
		this.fileHasHeader = fileHasHeader;
	}

	public String getCassandraKeyspace() {
		return cassandraKeyspace;
	}

	public void setCassandraKeyspace(String cassandraKeyspace) {
		this.cassandraKeyspace = cassandraKeyspace;
	}

	public String getCassandraTablename() {
		return cassandraTablename;
	}

	public void setCassandraTablename(String cassandraTablename) {
		this.cassandraTablename = cassandraTablename;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}
}

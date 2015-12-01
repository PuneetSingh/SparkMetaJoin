package org.apache.sparkmeta.join.constants;

public enum SourceType {

	CASSANDRA("cassandra"), FILE("file"), DATABASE("database");
	
	private String value;
	
	private SourceType(String sourceType) {
		this.value = sourceType;
	}
	
	public String getValue() {
		return this.value;
	}
}

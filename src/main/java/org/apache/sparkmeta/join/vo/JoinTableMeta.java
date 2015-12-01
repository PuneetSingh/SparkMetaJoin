package org.apache.sparkmeta.join.vo;

import java.util.ArrayList;

import org.apache.sparkmeta.join.reader.Reader;

public class JoinTableMeta {

	private String tableName;
	private ArrayList<String> joinKeys;
	private Reader reader;
	
	public Reader getReader() {
		return reader;
	}
	public void setReader(Reader reader) {
		this.reader = reader;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public ArrayList<String> getJoinKeys() {
		return joinKeys;
	}
	public void setJoinKeys(ArrayList<String> joinKeys) {
		this.joinKeys = joinKeys;
	}
	
}

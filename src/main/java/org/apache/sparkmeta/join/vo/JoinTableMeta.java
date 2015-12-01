package org.apache.sparkmeta.join.vo;

import java.util.ArrayList;

import org.apache.sparkmeta.join.sources.Source;

public class JoinTableMeta {

	private String tableName;
	private ArrayList<String> joinKeys;
	private Source source;
	
	public Source getSource() {
		return source;
	}
	public void setSource(Source source) {
		this.source = source;
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

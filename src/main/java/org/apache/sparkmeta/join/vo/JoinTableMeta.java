package org.apache.sparkmeta.join.vo;

import java.util.ArrayList;

public class JoinTableMeta {

	private String tableName;
	private ArrayList<String> joinKeys;
	private JoinFileMeta fileMetaData;
	
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
	public JoinFileMeta getFileMetaData() {
		return fileMetaData;
	}
	public void setFileMetaData(JoinFileMeta fileMetaData) {
		this.fileMetaData = fileMetaData;
	}
	
}

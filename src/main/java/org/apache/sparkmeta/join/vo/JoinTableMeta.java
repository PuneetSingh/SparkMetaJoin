package org.apache.sparkmeta.join.vo;

import java.util.ArrayList;
import java.util.Map;

public class JoinTableMeta {

	private String tableName;
	private ArrayList<String> joinKeys;
	private Map<String, Pair<String, Object>> filterKeyVals;
	private SourceMeta sourceMeta;
	
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
	public Map<String, Pair<String, Object>> getFilterKeyVals() {
		return filterKeyVals;
	}
	public void setFilterKeyVals(Map<String, Pair<String, Object>> filterKeyVals) {
		this.filterKeyVals = filterKeyVals;
	}
	public SourceMeta getSourceMeta() {
		return sourceMeta;
	}
	public void setSourceMeta(SourceMeta sourceMeta) {
		this.sourceMeta = sourceMeta;
	}
	
}

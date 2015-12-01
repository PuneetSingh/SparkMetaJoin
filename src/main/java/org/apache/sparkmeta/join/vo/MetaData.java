package org.apache.sparkmeta.join.vo;

import java.util.TreeMap;

public class MetaData {

	private TreeMap<Integer, JoinMeta> joinMap;

	public TreeMap<Integer, JoinMeta> getJoinMap() {
		return joinMap;
	}

	public void setJoinMap(TreeMap<Integer, JoinMeta> joinMap) {
		this.joinMap = joinMap;
	}
	
}

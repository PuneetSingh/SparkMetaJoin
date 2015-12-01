package org.apache.sparkmeta.join.vo;

import java.util.HashMap;

public class MetaData {

	private HashMap<Integer, JoinMeta> joinMap;

	public HashMap<Integer, JoinMeta> getJoinMap() {
		return joinMap;
	}

	public void setJoinMap(HashMap<Integer, JoinMeta> joinMap) {
		this.joinMap = joinMap;
	}
	
}

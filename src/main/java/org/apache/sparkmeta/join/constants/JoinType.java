package org.apache.sparkmeta.join.constants;

public enum JoinType {
	
	INNER("inner"), LEFT_JOIN("left"), RIGHT_JOIN("right");
	
	private String value;
	
	private JoinType(String joinType) {
		this.value = joinType;
	}
	
	public String getValue() {
		return value;
	}
}

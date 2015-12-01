package org.apache.sparkmeta.join.vo;

import org.apache.sparkmeta.join.constants.JoinType;

public class JoinMeta {

	private JoinType joinType;
	private int order;
	private JoinTableMeta leftTable;
	private JoinTableMeta rightTable;
	
	public JoinType getJoinType() {
		return joinType;
	}
	public void setJoinType(JoinType joinType) {
		this.joinType = joinType;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public JoinTableMeta getLeftTable() {
		return leftTable;
	}
	public void setLeftTable(JoinTableMeta leftTable) {
		this.leftTable = leftTable;
	}
	public JoinTableMeta getRightTable() {
		return rightTable;
	}
	public void setRightTable(JoinTableMeta rightTable) {
		this.rightTable = rightTable;
	}
	
}

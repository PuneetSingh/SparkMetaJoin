package org.apache.sparkmeta.join.vo;

import java.util.ArrayList;

import org.apache.sparkmeta.join.constants.JoinType;

public class Join {

	private JoinType joinType;
	private int order;
	private String leftTable;
	private String leftFilePath;
	private String rightFilePath;
	private String rightTable;
	private ArrayList<String> leftCols;
	private ArrayList<String> rightCols;
	
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
	public String getLeftTable() {
		return leftTable;
	}
	public void setLeftTable(String leftTable) {
		this.leftTable = leftTable;
	}
	public String getLeftFilePath() {
		return leftFilePath;
	}
	public void setLeftFilePath(String leftFilePath) {
		this.leftFilePath = leftFilePath;
	}
	public String getRightFilePath() {
		return rightFilePath;
	}
	public void setRightFilePath(String rightFilePath) {
		this.rightFilePath = rightFilePath;
	}
	public String getRightTable() {
		return rightTable;
	}
	public void setRightTable(String rightTable) {
		this.rightTable = rightTable;
	}
	public ArrayList<String> getLeftCols() {
		return leftCols;
	}
	public void setLeftCols(ArrayList<String> leftCols) {
		this.leftCols = leftCols;
	}
	public ArrayList<String> getRightCols() {
		return rightCols;
	}
	public void setRightCols(ArrayList<String> rightCols) {
		this.rightCols = rightCols;
	}
	
}

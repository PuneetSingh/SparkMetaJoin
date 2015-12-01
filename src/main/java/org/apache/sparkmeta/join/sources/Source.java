package org.apache.sparkmeta.join.sources;

import org.apache.sparkmeta.join.constants.SourceType;

public abstract class Source {

	private SourceType sourceType;
	
	public Source(SourceType sourceType) {
		this.setSourceType(sourceType);
	}

	public SourceType getSourceType() {
		return sourceType;
	}

	public void setSourceType(SourceType sourceType) {
		this.sourceType = sourceType;
	}
}

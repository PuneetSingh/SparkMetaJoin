package org.apache.sparkmeta.join.reader;

import java.io.Closeable;

import org.apache.sparkmeta.join.sources.Source;

public abstract class Reader implements Closeable {

	private Source source;

	public Reader(Source source) {
		super();
		this.source = source;
	}

	public Source getSource() {
		return source;
	}
	
}

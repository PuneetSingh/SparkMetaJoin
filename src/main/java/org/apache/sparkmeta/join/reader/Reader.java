package org.apache.sparkmeta.join.reader;

import java.io.Closeable;

import org.apache.spark.sql.DataFrame;

public abstract class Reader implements Closeable {

	protected abstract DataFrame getDataFrame();

}

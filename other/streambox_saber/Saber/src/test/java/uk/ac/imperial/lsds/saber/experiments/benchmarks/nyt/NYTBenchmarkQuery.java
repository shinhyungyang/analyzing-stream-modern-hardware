package uk.ac.imperial.lsds.saber.experiments.benchmarks.nyt;

import uk.ac.imperial.lsds.saber.ITupleSchema;
import uk.ac.imperial.lsds.saber.QueryApplication;

public interface NYTBenchmarkQuery {

	public QueryApplication getApplication ();

	public ITupleSchema getSchema ();
}

package de.mpg.mpi_inf.ambiversenlu.nlu.ner.configuration;

import de.mpg.mpi_inf.ambiversenlu.nlu.entitylinking.uima.custom.readers.OrderType;

import java.util.Map;

/**
 * An object which holds information about the corpus: ranges of the corpus and format
  */
public class CorpusConfiguration {

	public static final String CORPUS_DIRECTORY_NAME = "corpus";
	public static final String DEFAULT_CORPUS_NAME = "default";
	public static final String DEFAULT_FILE_NAME = "corpus.tsv";
	public static final String DEFAULT_CORPUS_CONFIG_NAME = "configuration.json";
	public static final int DEFAULT_AUTOGENERATED_CORPUS_SIZE = 5000;

	private OrderType corpusFormat;
	public enum Range {TRAIN, TESTA, TESTB, TRAINA}
	private Map<Range, int[]> rangeMap;

	public CorpusConfiguration() {
	}

	public CorpusConfiguration(OrderType corpusFormat, Map<Range, int[]> rangeMap) {
		this.corpusFormat = corpusFormat;
		this.rangeMap = rangeMap;
	}

	public OrderType getCorpusFormat() {
		return corpusFormat;
	}

	public void setCorpusFormat(OrderType corpusFormat) {
		this.corpusFormat = corpusFormat;
	}

	public Map<Range, int[]> getRangeMap() {
		return rangeMap;
	}

	public void setRangeMap(Map<Range, int[]> rangeMap) {
		this.rangeMap = rangeMap;
	}
}

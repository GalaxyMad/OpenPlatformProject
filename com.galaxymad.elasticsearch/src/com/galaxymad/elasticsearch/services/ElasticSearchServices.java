package com.galaxymad.elasticsearch.services;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Provides;

/*
 * interface with elastic search API. provide a simple API to access to elastic search and create indexes
 */
@Component
@Provides
public interface ElasticSearchServices {

	/*
	 * search for element that match the regular expression in the index  identified by indexName
	 */
	public Result query(String regexp, String indexName);
	
	/*
	 * index a collection or single objet to the index specified
	 */
	public Result index(Object data, String indexName);
}

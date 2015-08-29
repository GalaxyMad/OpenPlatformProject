package com.galaxymad.orm.services;

import java.io.Serializable;

/*
 * 
 * provide a way to serializer an Object or cLass in serializable object and a parser to parser to create an object for a serialized flow
 * 
 *   can be in JSON, XML, etc...
 */


public interface OrmService {

	/*
	 * add the class into the contrat of element available and that can be convert in store in mongodb
	 */
	public void addInContract(String name,Class<?> klass);
	
	public Serializable serialize(Object obj);
	
	public Serializable serializeTemplate(Class<?> obj);
	
	public Object parse(Serializable flow);
	
}	


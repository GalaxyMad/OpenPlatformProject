package com.galaxymad.orm.impl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import java.util.function.Consumer;
import java.util.function.Predicate;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.galaxymad.orm.annotations.GalaxyEntity;
import com.galaxymad.orm.annotations.Property;
import com.galaxymad.orm.annotations.Reference;

import com.galaxymad.orm.services.Serializer;

public class SerializerImpl implements Serializer{

	private JSONObject root;


	
	
	public String serailize(Object content) {
		if( content.getClass().getAnnotation(GalaxyEntity.class) !=null ){
			List<Field> list = Arrays.asList(content.getClass().getDeclaredFields());
			list.stream().filter(getPredicateFilter(Property.class)).forEach(getConsumerGet(content, Property.class));
		}
		return null;
	}

	public Predicate<Field> getPredicateFilter(Class<? extends Annotation> klass) {
		return (f) -> f.getAnnotation(Property.class) !=null ||  f.getAnnotation(Reference.class) !=null ;
	}
	public Consumer<Field> getConsumerGet(Object ref, Class<? extends Annotation> ann) {
		return (f) -> handler(ref,f,ann);
	}
	
	protected JSONObject handler(Object ref, Field Field, Class<? extends Annotation> ann){
		return null; //TODO
	}
	
	private Object safeGet(Field f, Object o){
		try{
			f.setAccessible(true);
			return f.get(o);
		}catch(Exception e){
			// TODO log
			return null;
		}
	}


}

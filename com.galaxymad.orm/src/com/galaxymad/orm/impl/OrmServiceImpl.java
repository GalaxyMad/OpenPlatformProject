package com.galaxymad.orm.impl;

import java.io.Serializable;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Provides;

import com.galaxymad.orm.services.OrmService;


@Component
@Provides
public class OrmServiceImpl implements OrmService{

	
	
	@Override
	public void addInContract(String name, Class<?> klass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Serializable serialize(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Serializable serializeTemplate(Class<?> obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object parse(Serializable flow) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.java.consumer.mapper;

import com.java.consumer.domain.User;

import ma.glasnost.orika.MapperFactory;
/**
 * 
 * @author Anil
 *
 */
public class ConsumerMapper {

	private MapperFactory restServiceModelDomainFactory = null;
	 
	public ConsumerMapper(MapperFactory restServiceModelDomainFactory) {

		this.restServiceModelDomainFactory = restServiceModelDomainFactory;
		mapUserModelDomainMapper();
	}

	private void mapUserModelDomainMapper() {

		restServiceModelDomainFactory.classMap(User.class, com.java.consumer.domain.User.class).byDefault();
	}

}

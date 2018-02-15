package com.java.consumer.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.consumer.dao.repository.UserRepository;
import com.java.consumer.helper.Response;
import com.java.consumer.model.User;

import ma.glasnost.orika.MapperFacade;

@Service(value = "businessFunctionService")
public class BusinessFunctionServiceImpl implements BusinessFunctionService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	public User securitydemoGetById;

	@Resource(name = "restServiceModelDomainMapperFacade")
	private MapperFacade restServiceModelDomainMapperFacade;

	@Override
	public String addUser(User user) {
		com.java.consumer.domain.User domain = restServiceModelDomainMapperFacade.map(user,
				com.java.consumer.domain.User.class);
		userRepository.saveAndFlush(domain);
		return "saved";
	}

	@Override
	public User findByUserId(Integer id) {

		com.java.consumer.domain.User domain = userRepository.findOne(id);
		if (domain == null) {
			throw new SecurityException("Entity Not Found");
		}
		User model = restServiceModelDomainMapperFacade.map(domain, User.class);
		return model;
	}

	@Override
	public User getUserByName(String name) {
		com.java.consumer.domain.User domain = userRepository.findByLastname(name);
		User model = restServiceModelDomainMapperFacade.map(domain, User.class);
		return model;
	}

	@Override
	public Response deleteById(Integer id) {
		com.java.consumer.domain.User domain = userRepository.findOne(id);
		userRepository.delete(domain);
		Response response = new Response();
		response.setMessageCode("4000");
		response.setMessage("Deleted " + id + " Successful");
		return response;
	}

	@Override
	public User getUserFromSecurityDemo() {
		// TODO Auto-generated method stub
		return securitydemoGetById;
	}

}

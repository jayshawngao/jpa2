package jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jpa.dao.PersonDao;
import jpa.spring.entities.Person;

@Service
public class PersonService {

	@Autowired
	private PersonDao dao;
	
	@Transactional
	public void savePerson(Person p1, Person p2){
		dao.save(p1);
		dao.save(p2);
		
	}
}

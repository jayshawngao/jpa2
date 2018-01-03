package jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import jpa.spring.entities.Person;

@Repository
public class PersonDao {

	@PersistenceContext
	private EntityManager manager;
	
	public void save(Person person){
		manager.persist(person);
		
	}
	
}

package jpa.spring;

import java.sql.SQLException;
import java.util.Date;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jpa.service.PersonService;
import jpa.spring.entities.Person;

public class JPATest {
	
	private ApplicationContext ctx = null;
	private PersonService personService = null;
	
	{
		ctx = new ClassPathXmlApplicationContext("spring.xml");
		personService = ctx.getBean(PersonService.class);
	}
	
	
	@Test
	public void testPersonService(){
		Person p1 = new Person(null, "AA", new Date());
		Person p2 = new Person(null, "BB", new Date());
		
		System.out.println(personService.getClass().getName());
		personService.savePerson(p1, p2);
	}
	
	@Test
	public void testDataSource() throws SQLException {
		DataSource dataSource = ctx.getBean(DataSource.class);
		System.out.println(dataSource.getConnection());
	}

}

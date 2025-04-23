package com.raza.s06SpringJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.raza.s06SpringJDBC.dao.AlienDao;
import com.raza.s06SpringJDBC.model.Alien;

@SpringBootApplication
public class S06SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(S06SpringJdbcApplication.class, args);
		Alien alien = context.getBean(Alien.class);
		alien.setId(111);
		alien.setName("Raza");
		alien.setTech("Java");
		
		AlienDao dao = context.getBean(AlienDao.class);
		dao.save(alien);
		
		System.out.println(dao.findAll());
	}

}

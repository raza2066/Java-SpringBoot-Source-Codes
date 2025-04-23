package com.raza.s06SpringJDBC.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.raza.s06SpringJDBC.model.Alien;

@Repository
public class AlienDao {
	
	private JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	
	public void save(Alien alien) {
		String querry = "insert into alien(id,name,tech) values (?,?,?)";
		int rows = template.update(querry, alien.getId(),alien.getName(),alien.getTech());
		System.out.println("Rows Affected:" + rows);
	}
	public List<Alien> findAll(){
		String sql = "Select * from Alien";
		
		RowMapper<Alien> mapper = (rs, row) -> {
			Alien alien = new Alien();
			
			alien.setId(rs.getInt(1));
			alien.setName(rs.getString(2));
			alien.setTech(rs.getString(3));
			
			return alien;
		};
		
		
		
		List<Alien> aliens = template.query(sql, mapper);
		
		return aliens;
	}
}

package edu.htn.dao;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import edu.htn.jdbc.UserRowMapper;
import edu.htn.pojo.Comorbidity;


public class ComorbidityDaoImpl implements ComorbidityDao {

	@Autowired
	DataSource dataSource;

	
	@Override
	public void insertComorbidity(Comorbidity comorbidity) {
		String sql = "INSERT INTO userdao " + "(first_name,last_name, gender, city) VALUES (?, ?, ?,?)";

		System.out.println(sql);
		
		
	}

	
}
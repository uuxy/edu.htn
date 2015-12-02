package edu.htn.services;

import org.springframework.beans.factory.annotation.Autowired;

import edu.htn.dao.ComorbidityDao;
import edu.htn.pojo.Comorbidity;


public class ComorbidityServiceImpl implements ComorbidityService {

	@Autowired
	ComorbidityDao comorbiditydao;

	
	@Override
	public void insertComorbidity(Comorbidity comorbidity) {
		// TODO Auto-generated method stub
		comorbiditydao.insertComorbidity(comorbidity);
		
	}
}

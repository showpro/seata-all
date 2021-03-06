package com.example.two.service;

import java.util.Random;

import com.example.two.dao.TblTwoDao;
import com.example.two.entity.TblTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author yueyi2019
 */
@Service
public class RmTwoService {
	
	@Autowired
	TblTwoDao mapper;
	
	public String rm2() {
		TblTwo o = new TblTwo();
		o.setId(2);
		o.setName("rm2");
		mapper.insertSelective(o);
		
		return "";
	}
	
	public String updateRm2() {
		TblTwo o = mapper.selectByPrimaryKey(2);
		o.setName(o.getName()+new Random().nextInt(2));
		mapper.updateByPrimaryKeySelective(o);
		return "";
	}
}
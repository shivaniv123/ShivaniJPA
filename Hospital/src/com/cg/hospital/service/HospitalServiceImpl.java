package com.cg.hospital.service;


import java.util.ArrayList;
import java.util.regex.Pattern;

import com.cg.hospital.dao.HospitalDao;
import com.cg.hospital.dao.HospitalDaoImpl;
import com.cg.hospital.dto.Hospital;
import com.cg.hospital.exception.HospitalException;



public class HospitalServiceImpl implements HospitalService {

	

	HospitalDao dao;
	
	public void setDao(HospitalDao dao)
	{
		this.dao = dao;
	}
	
	public HospitalServiceImpl()
	{
		dao = new HospitalDaoImpl();
	}
	
	
	@Override
	public int addHospital(Hospital emp) throws HospitalException {
		// TODO Auto-generated method stub
		return dao.addHospital(emp);
	}

	@Override
	public Hospital removeHospital(int empId) throws HospitalException {
		// TODO Auto-generated method stub
		return dao.removeHospital(empId);
	}

	@Override
	public Hospital getHospitalById(int empId) throws HospitalException {
		// TODO Auto-generated method stub
		return dao.getHospitalById(empId);
	}

	@Override
	public ArrayList<Hospital> getAllHospital() throws HospitalException {
		// TODO Auto-generated method stub
		return dao.getAllHospital();
	}

	@Override
	public Hospital updateHospital(int empId, int empSal)
			throws HospitalException {
		// TODO Auto-generated method stub
		return dao.updateHospital(empId, empSal);
	}

	
	
	public boolean validateName(String name)
	{
		String pattern = "[A-z]{1}[a-z]{2,}";
		if(Pattern.matches(pattern,name))
		{
			return true;
		}
		else
			return false;
	}
	public boolean validateSalary(int salary)
	{
		String pattern = "[0-9]{4,6}";
		String sal = ""+salary;
		if(Pattern.matches(pattern,sal))
		{
			return true;
		}
		else 
			return false;
	}
}

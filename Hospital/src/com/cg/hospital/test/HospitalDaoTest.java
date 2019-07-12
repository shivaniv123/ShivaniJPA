package com.cg.hospital.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cg.hospital.dao.HospitalDao;
import com.cg.hospital.dao.HospitalDaoImpl;
import com.cg.hospital.dto.Hospital;
import com.cg.hospital.exception.HospitalException;
import com.cg.hospital.service.HospitalServiceImpl;



public class HospitalDaoTest {

	HospitalServiceImpl service;
	HospitalDao dao;
	
	@Before
	public void init()
	{
		dao = new HospitalDaoImpl();
		service  = new HospitalServiceImpl();
		service.setDao(dao);
	}
	@Test
	public void testGetAllHospital() throws HospitalException
	{
		ArrayList<Hospital>list = service.getAllHospital();
		assertNotNull(list);
	}
	@Test
	public void testAddHospital() throws HospitalException
	{
		Hospital emp = new Hospital();
		emp.setpName("Hina");
		emp.setpBill(40000);
		emp.setPhone(458248124);
		
		int id = service.addHospital(emp);
		assertNotSame(id,0);
	}
	@Test
	public void testDeleteHospital() throws HospitalException
	{
		Hospital emp = service.removeHospital(2025);
		assertNotNull(emp);
	}
	@Test
	public void updateHospital() throws HospitalException
	{
		Hospital emp = service.updateHospital(2026, 100);
		assertNotNull(emp);
	}
	@After
	public void destroy()
	{
		dao = null;
		service = null;
	}
}

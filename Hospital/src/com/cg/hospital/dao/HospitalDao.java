package com.cg.hospital.dao;

import java.util.ArrayList;

import com.cg.hospital.dto.Hospital;
import com.cg.hospital.exception.HospitalException;


public interface HospitalDao {
	int addHospital(Hospital emp)throws HospitalException;
	Hospital removeHospital(int empId)throws HospitalException;
	Hospital getHospitalById(int empId)throws HospitalException;
	ArrayList<Hospital>getAllHospital()throws HospitalException;
	Hospital updateHospital(int pId,int pBill)throws HospitalException;

}

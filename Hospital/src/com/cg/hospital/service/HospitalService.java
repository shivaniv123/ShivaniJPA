package com.cg.hospital.service;

import java.util.ArrayList;

import com.cg.hospital.dto.Hospital;
import com.cg.hospital.exception.HospitalException;

public interface HospitalService {
	int addHospital(Hospital emp)throws HospitalException;
	Hospital removeHospital(int empId)throws HospitalException;
	Hospital getHospitalById(int empId)throws HospitalException;
	ArrayList<Hospital>getAllHospital()throws HospitalException;
	Hospital updateHospital(int empId,int empSal)throws HospitalException;
	boolean validateName(String name);


}

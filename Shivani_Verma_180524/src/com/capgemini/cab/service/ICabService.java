package com.capgemini.cab.service;

import java.time.LocalDate;

import com.capgemini.cab.exception.CabException;
import com.capgemini.cabs.bean.CabRequest;

public interface ICabService {
	int addCabRequestDetails(CabRequest cabRequest)throws CabException;
	CabRequest getRequestDetails(int requestId)throws CabException;
	boolean validateName(String name);
	boolean validatePhnNumber(long phn);
	boolean validateDate(String date);
	boolean validateRequest(String status);
	boolean validateCab(String cab);
	boolean validatePin(String pin);

}

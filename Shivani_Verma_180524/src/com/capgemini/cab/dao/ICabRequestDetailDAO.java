package com.capgemini.cab.dao;

import com.capgemini.cab.exception.CabException;
import com.capgemini.cabs.bean.CabRequest;


public interface ICabRequestDetailDAO {
 
int addCabRequestDetails(CabRequest cabRequest)throws CabException;
CabRequest getRequestDetails(int requestId)throws CabException;
}

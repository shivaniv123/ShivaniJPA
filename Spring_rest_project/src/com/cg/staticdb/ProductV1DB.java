package com.cg.staticdb;

import java.util.HashMap;


import com.cg.beans.ProductV1;

public class ProductV1DB {
static HashMap<Integer,ProductV1> productV1IdMap = getProductV1IdMap();
	
	static {
		if (productV1IdMap == null) {
			productV1IdMap = new HashMap<Integer, ProductV1>();
			ProductV1 indiaProductV1 = new ProductV1( "Pen",1);
			ProductV1 chinaProductV1 = new ProductV1( "Pencil",1);
			
			

			productV1IdMap.put(1, indiaProductV1);
			productV1IdMap.put(4, chinaProductV1);
			
		}

	}
	
	public static HashMap<Integer, ProductV1> getProductV1IdMap() {
		return productV1IdMap;
	}
}

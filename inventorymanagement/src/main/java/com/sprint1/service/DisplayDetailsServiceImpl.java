package com.sprint1.service;

import java.util.*;
import java.util.Map;
import com.sprint1.util.ProductOrderNotFoundException;
import com.sprint1.util.RawMaterialOrderNotFoundException;
import com.sprint1.dao.DisplayDetailsDaoImpl;
import com.sprint1.model.ProductDetails;
import com.sprint1.model.RawMaterialDetails;

public class DisplayDetailsServiceImpl implements DisplayDetailsService {// 4
	DisplayDetailsDaoImpl trackDaoImplObj = new DisplayDetailsDaoImpl();// 5

	public RawMaterialDetails trackOrder(String OrderId) throws RawMaterialOrderNotFoundException {
		RawMaterialDetails a = trackDaoImplObj.trackOrder(OrderId);
		if (a == null) {
			throw new RawMaterialOrderNotFoundException(" Order Id Must Lies In Between 0 to 6. Hence, No order exists with order Id : " + OrderId);
		}
		return a;
	}

	public ProductDetails ProductOrder(String ProductId) throws ProductOrderNotFoundException {
		ProductDetails a = trackDaoImplObj.trackProductOrder(ProductId);
		if (a == null) {
			throw new ProductOrderNotFoundException(" Order Id Must Lies In Between 0 to 6. Hence, No order exists with order Id : " + ProductId);
		}
		return a;
	}

}

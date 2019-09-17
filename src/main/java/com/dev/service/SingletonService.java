package com.dev.service;

import com.dev.dao.CatalogueDAOImpl;

public class SingletonService {

	private static CatalogueServiceImpl service;
	
	static {
		CatalogueDAOImpl dao = new CatalogueDAOImpl();
		dao.initialisation();
		service = new CatalogueServiceImpl();
		service.setDao(dao);
	}

	public static CatalogueServiceImpl getService() {
		return service;
	}
	
}

package com.bpm.service;

import java.util.HashMap;
import java.util.List;

public interface CatalogServiceInf {

	public List createCatalog();

	public List editCatalog();

	public List deleteCatalog();

	public List findCatalog();

	public List findAllCatalog();

	public HashMap getCatalogDetails();

	public HashMap saveToCart(String cartItemList);
}

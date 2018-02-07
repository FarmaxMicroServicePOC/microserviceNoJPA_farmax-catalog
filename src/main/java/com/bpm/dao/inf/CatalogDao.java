package com.bpm.dao.inf;

import java.util.HashMap;
import java.util.List ;

import com.bpm.model.CatalogItem;

public interface CatalogDao {


	public List<CatalogItem> createCatalog();

	public List<CatalogItem> editCatalog();

	public List<CatalogItem> deleteCatalog();

	public List<CatalogItem> findCatalog();

	public List<CatalogItem> findAllCatalog();

	public HashMap getCatalogDetails();

	public HashMap saveToCart(HashMap cartMap);
}

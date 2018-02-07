package com.bpm.dao.impl;


import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import com.bpm.dao.inf.CatalogDao;
import com.bpm.model.CatalogItem;


@Repository("catalogdDao")
public class CatalogDaoImpl implements CatalogDao{
	private static Logger log = Logger.getLogger(CatalogDaoImpl.class.getName()); 
	
	@Override
	public HashMap getCatalogDetails() {
		log.debug("CatalogDaoImpl.getCatalogDetails()");
		System.out.println("CatalogDaoImpl.java : getCatalogDetails()");
		
		List<CatalogItem> catalogList = new ArrayList<CatalogItem>();
		CatalogItem catalogItem = new CatalogItem();
		catalogItem.setId(1001);
		catalogItem.setName("Paracetamol O Tablet");
		catalogItem.setType("500 tablets");
		catalogItem.setManufacturer("Makers Laboratories Ltd");
		catalogItem.setCost("106.43");
		catalogItem.setDiscount("0%");
		catalogItem.setAvailability("no");
		catalogList.add(catalogItem);
		
		catalogItem = new CatalogItem();
		catalogItem.setId(1002);
		catalogItem.setName("Solvin Cold Syrup");
		catalogItem.setType("60 ml Syrup");
		catalogItem.setManufacturer("Ipca Laboratories Ltd");
		catalogItem.setCost("44");
		catalogItem.setDiscount("0%");
		catalogItem.setAvailability("yes");
		catalogList.add(catalogItem);

		catalogItem = new CatalogItem();
		catalogItem.setId(1003);
		catalogItem.setName("Corex DX Syrup");
		catalogItem.setType("100 ml syrup");
		catalogItem.setManufacturer("Pfizer Ltd");
		catalogItem.setCost("90.52");
		catalogItem.setDiscount("0%");
		catalogItem.setAvailability("yes");
		catalogList.add(catalogItem);
		
		catalogItem = new CatalogItem();
		catalogItem.setId(1004);
		catalogItem.setName("Solvin Cold Tablet");
		catalogItem.setType("10 tablets");
		catalogItem.setManufacturer("Ipca Laboratories Ltd");
		catalogItem.setCost("38.50");
		catalogItem.setDiscount("0%");
		catalogItem.setAvailability("yes");
		catalogList.add(catalogItem);
		

		catalogItem = new CatalogItem();
		catalogItem.setId(1005);
		catalogItem.setName("Brufen 400mg Tablet");
		catalogItem.setType("Strip of 15 tablets");
		catalogItem.setManufacturer("Abott");
		catalogItem.setCost("10.62");
		catalogItem.setDiscount("0%");
		catalogItem.setAvailability("yes");
		catalogList.add(catalogItem);

		catalogItem = new CatalogItem();
		catalogItem.setId(1006);
		catalogItem.setName("Naxdom 250 Tablet");
		catalogItem.setType("5.05/Tablet");
		catalogItem.setManufacturer("Sun Pharmaceutical Industries Ltd");
		catalogItem.setCost("50.5");
		catalogItem.setDiscount("0%");
		catalogItem.setAvailability("yes");
		catalogList.add(catalogItem);
		
		String IP = "";
		try {
			IP = Inet4Address.getLocalHost().getHostAddress();
			System.out.println("\t Inet4Address.getLocalHost().getHostAddress() : " + IP
					         + "\n\t Inet4Address.getLocalHost() : " + Inet4Address.getLocalHost());
			System.out.println("\t InetAddress.getLocalHost().getHostAddress() : " + InetAddress.getLocalHost().getHostAddress()
							 + "\n\t InetAddress.getLocalHost() : " + InetAddress.getLocalHost());
		} catch (UnknownHostException e) {
			System.out.println("Exception thrown while fetching IP address");
			e.printStackTrace();
			
		}
		HashMap catalogMap = new HashMap();
		catalogMap.put("catalogList", catalogList);
		catalogMap.put("IP", IP);
		
		
		log.debug("\t catalogList.size() : " + catalogList.size());
		System.out.println("\t catalogList.size() :: " + catalogList.size() + "\n\t catalogList : " + catalogList.toString());
		return catalogMap;
	}
	
	
	@Override
	public List<CatalogItem> createCatalog() {
		log.info("CatalogDaoImpl.createCatalog()");
		
		List catalogList = new ArrayList<CatalogItem>();
		CatalogItem catalogItem = new CatalogItem();
		catalogItem = new CatalogItem();
		catalogItem.setName("Naxdom 250 Tablet");
		catalogItem.setType("5.05/Tablet");
		catalogItem.setManufacturer("Sun Pharmaceutical Industries Ltd");
		catalogItem.setCost("50.5");
		catalogItem.setDiscount("0%");
		catalogItem.setAvailability("yes");

		catalogList.add(catalogItem);
		
		catalogItem = new CatalogItem();
		catalogItem.setName("Brufen 400mg Tablet");
		catalogItem.setType("Strip of 15 tablets");
		catalogItem.setManufacturer("Abott");
		catalogItem.setCost("10.62");
		catalogItem.setDiscount("0%");
		catalogItem.setAvailability("yes");
		catalogList.add(catalogItem);
		
		return catalogList;
	}

	@Override
	public List<CatalogItem> editCatalog() {
		log.info("CatalogDaoImpl.editCatalog()");
		return null;
	}

	@Override
	public List<CatalogItem> deleteCatalog() {
		log.info("CatalogDaoImpl.deleteCatalog()");
		return null;
	}

	@Override
	public List<CatalogItem> findCatalog() {
		log.info("CatalogDaoImpl.findCatalog()");
		return null;
	}

	@Override
	public List<CatalogItem> findAllCatalog() {
		log.info("CatalogDaoImpl.findCatalog()");
		return null;
	}

	@Override
	public HashMap saveToCart(HashMap cartMap) {
		log.info("CatalogDaoImpl.saveToCart()");
		System.out.println("CatalogDaoImpl.saveToCart()");
		System.out.println("\t cartMap : " + cartMap.toString());

		cartMap.put(1007, 1);
		return cartMap;
	}

}

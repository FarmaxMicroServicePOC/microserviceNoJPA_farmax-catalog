package com.bpm.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.bpm.service.CatalogServiceInf;
import com.google.gson.Gson;


@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	CatalogServiceInf catalogService; 	
	
	/**
	 * This service returns Dashboard details
	 * @return String
	 */
	@RequestMapping(value = "/getCartDetails", method = RequestMethod.GET)
	public @ResponseBody
	String getCatalogDetails(HttpServletRequest request) {
		System.out.println("CatalogController : getCatalogDetails");
		String response = null;

    	HashMap catalogMap = catalogService.getCatalogDetails();
    	response = new Gson().toJson(catalogMap);
    	
    	return response;
	}

	/**
	 * This service creates a catalog  
	 * @return String
	 */
	@RequestMapping(value = "/saveToCart", method = RequestMethod.POST,headers = "Accept=application/json")
	public @ResponseBody
	HashMap saveToCart(@RequestBody String request) {
		System.out.println("CatalogController : saveToCart");
		System.out.println("\t request.toString() : " + request.toString());
		
		String cartItemList = request.toString();
    	HashMap cartItemMap = catalogService.saveToCart(cartItemList);
    	
    	return cartItemMap;
	}	
	
	/**
	 * This service edit a catalog  
	 * @return String
	 */
	@RequestMapping(value = "/editCart", method = RequestMethod.GET)
	public @ResponseBody
	String editCatalog(HttpServletRequest request) {
		System.out.println("CatalogController : editCatalog");
		String response = null;

    	List dashboardBeanList = catalogService.editCatalog();
    	response = new Gson().toJson(dashboardBeanList);
    	
    	return response;
	}	
	
	/**
	 * This service edit a catalog  
	 * @return String
	 */
	@RequestMapping(value = "/deleteCart", method = RequestMethod.GET)
	public @ResponseBody
	String deleteCatalog(HttpServletRequest request) {
		System.out.println("CatalogController : deleteCatalog");
		String response = null;

    	List dashboardBeanList = catalogService.deleteCatalog();
    	response = new Gson().toJson(dashboardBeanList);
    	
    	return response;
	}	

	/**
	 * This service edit a catalog  
	 * @return String
	 */
	@RequestMapping(value = "/findCart", method = RequestMethod.GET)
	public @ResponseBody
	String findCatalog(HttpServletRequest request) {
		System.out.println("CatalogController : findCatalog");
		String response = null;

    	List dashboardBeanList = catalogService.findCatalog();
    	response = new Gson().toJson(dashboardBeanList);
    	
    	return response;
	}	

	/**
	 * This service edit a catalog  
	 * @return String
	 */
	@RequestMapping(value = "/findAllCart", method = RequestMethod.GET)
	public @ResponseBody
	String findAllCatalog(HttpServletRequest request) {
		System.out.println("CatalogController : findAllCatalog");
		String response = null;

    	List dashboardBeanList = catalogService.findAllCatalog();
    	response = new Gson().toJson(dashboardBeanList);
    	
    	return response;
	}	

}

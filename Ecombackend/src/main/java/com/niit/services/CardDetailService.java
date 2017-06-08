package com.niit.services;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.validation.ValidationContext;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.webflow.execution.RequestContext;

import com.niit.dao.CardDetailDAO;
import com.niit.models.CardDetails;
import com.niit.myException.QtyNotAvaiable;

public class CardDetailService implements Serializable{
	
	@Autowired
	private CardDetailDAO cardDetailDao;
	
	public String addCardDetail(CardDetails cardDetail, RequestContext Context){
		try{
	    	HttpServletRequest request = (HttpServletRequest )Context.getExternalContext().getNativeRequest(); 
	    	cardDetailDao.addCardDetail(cardDetail, request.getUserPrincipal());
	    	return "success";
		}
		catch(Exception e){
			e.printStackTrace();
			return "qtyerror";
		}
	}

}

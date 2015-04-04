package com.caremore.mobile.spring.mvc.controllers;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.caremore.mobile.constants.QueryConstants;

@Controller
public class EligibilityController {

	@Autowired 
	@Qualifier("facetsDataSource")
	private DriverManagerDataSource facetsDataSource;
	
	@RequestMapping(value = "/secure/get-eligibility", method = RequestMethod.GET)
	public ModelAndView loadEligibilityForm() {
		ModelAndView modelAndView = new ModelAndView("get-eligibility");
		/*
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource
				.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		dataSource
				.setUrl("jdbc:sqlserver://10.41.180.56:1433;DatabaseName=FACETS");
		dataSource.setUsername("sbiapp_RW");
		dataSource.setPassword("B0wling4me@h0me");
		*/
		JdbcTemplate jdbcTemplate = new JdbcTemplate(facetsDataSource);
		/*
		List<Map<String,Object>> relationships = jdbcTemplate.queryForList(QueryConstants.relationshipsQuery);
		modelAndView.addObject("relationships", relationships);
		*/
		List<Map<String,Object>> productCategories = jdbcTemplate.queryForList(QueryConstants.productCategoriesQuery);
		modelAndView.addObject("productCategories", productCategories);
		return modelAndView;
	}

	@RequestMapping(value = "/secure/eligibility-info", method = RequestMethod.POST)
	public ModelAndView loadEligibilityInformationForm(
			@RequestParam(value = "policy_number") String subscriberId,
			//@RequestParam(value = "relationship") String memberRel,
			@RequestParam(value = "date_of_service") String dateOfService,
			@RequestParam(value = "product_category") String productCategory,
			HttpServletRequest request, HttpServletResponse response) {
		/*
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource
				.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		dataSource
				.setUrl("jdbc:sqlserver://10.41.180.56:1433;DatabaseName=FACETS");
		dataSource.setUsername("sbiapp_RW");
		dataSource.setPassword("B0wling4me@h0me");
		*/
		JdbcTemplate jdbcTemplate = new JdbcTemplate(facetsDataSource);
		List<Map<String,Object>> result = jdbcTemplate.queryForList(QueryConstants.eligibilityQuery,
				new Object[] { dateOfService, subscriberId, dateOfService, productCategory });
		System.out.println(dateOfService);
		System.out.println(result);
		ModelAndView modelAndView = new ModelAndView("eligibility-info");
		modelAndView.addObject("eligibilityInfo", result);
		return modelAndView;
	}

}

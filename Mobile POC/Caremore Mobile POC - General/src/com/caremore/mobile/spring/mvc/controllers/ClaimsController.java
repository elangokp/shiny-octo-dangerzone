package com.caremore.mobile.spring.mvc.controllers;

import java.util.ArrayList;
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
public class ClaimsController {

	@Autowired 
	@Qualifier("facetsDataSource")
	private DriverManagerDataSource facetsDataSource;
	
	@RequestMapping(value = "/secure/get-claim-details", method = RequestMethod.GET)
	public ModelAndView loadSearchByClaimIDForm() {
		ModelAndView modelAndView = new ModelAndView("get-claim-details");
		return modelAndView;
	}
	
	@RequestMapping(value = "/secure/search-claims", method = RequestMethod.GET)
	public ModelAndView loadSearchClaimsForm() {
		ModelAndView modelAndView = new ModelAndView("search-claims");
		return modelAndView;
	}
	
	@RequestMapping(value = "/secure/search-provider-claims", method = RequestMethod.GET)
	public ModelAndView loadSearchProviderClaimsForm() {
		ModelAndView modelAndView = new ModelAndView("search-provider-claims");
		return modelAndView;
	}
	
	@RequestMapping(value = "/secure/search-member-claims", method = RequestMethod.GET)
	public ModelAndView loadSearchMemberClaimsForm() {
		ModelAndView modelAndView = new ModelAndView("search-member-claims");
		return modelAndView;
	}
	
	@RequestMapping(value = "/secure/claims-list", method = RequestMethod.POST)
	public ModelAndView loadClaimsListForm(
			@RequestParam(value = "provider_npi") String providerNpi,
			@RequestParam(value = "policy_number") String policyNumber,
			@RequestParam(value = "from_date") String fromDate,
			@RequestParam(value = "till_date") String tillDate,
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
		List<Map<String,Object>> result = new ArrayList<Map<String,Object>>();
		JdbcTemplate jdbcTemplate = new JdbcTemplate(facetsDataSource);
		if(null!= providerNpi && !providerNpi.equalsIgnoreCase("") && null!= policyNumber && !policyNumber.equalsIgnoreCase("")){
			result = jdbcTemplate.queryForList(QueryConstants.claimsQuery,
					new Object[] { providerNpi, policyNumber, fromDate, tillDate, fromDate, tillDate });
		} else if(null!= providerNpi && !providerNpi.equalsIgnoreCase("") && (null== policyNumber || policyNumber.equalsIgnoreCase(""))) {
			result = jdbcTemplate.queryForList(QueryConstants.providerClaimsQuery,
						new Object[] { providerNpi, fromDate, tillDate, fromDate, tillDate });
		} else if((null== providerNpi || providerNpi.equalsIgnoreCase("")) && (null!= policyNumber && !policyNumber.equalsIgnoreCase(""))) {
			result = jdbcTemplate.queryForList(QueryConstants.memberClaimsQuery,
					new Object[] { policyNumber, fromDate, tillDate, fromDate, tillDate });
		}
		System.out.println(providerNpi);
		System.out.println(fromDate);
		System.out.println(tillDate);
		System.out.println(tillDate);
		System.out.println(result);
		ModelAndView modelAndView = new ModelAndView("claims-list");
		modelAndView.addObject("claims", result);
		return modelAndView;
	}
	
	@RequestMapping(value = "/secure/provider-claims-list", method = RequestMethod.POST)
	public ModelAndView loadProviderClaimsListForm(
			@RequestParam(value = "provider_npi") String providerNpi,
			@RequestParam(value = "from_date") String fromDate,
			@RequestParam(value = "till_date") String tillDate,
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
		List<Map<String,Object>> result = jdbcTemplate.queryForList(QueryConstants.providerClaimsQuery,
				new Object[] { providerNpi, fromDate, tillDate });
		System.out.println(providerNpi);
		System.out.println(fromDate);
		System.out.println(tillDate);
		System.out.println(tillDate);
		System.out.println(result);
		ModelAndView modelAndView = new ModelAndView("claims-list");
		modelAndView.addObject("claims", result);
		return modelAndView;
	}
	
	@RequestMapping(value = "/secure/member-claims-list", method = RequestMethod.POST)
	public ModelAndView loadMemberClaimsListForm(
			@RequestParam(value = "policy_number") String policyNumber,
			@RequestParam(value = "from_date") String fromDate,
			@RequestParam(value = "till_date") String tillDate,
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
		List<Map<String,Object>> result = jdbcTemplate.queryForList(QueryConstants.memberClaimsQuery,
				new Object[] { policyNumber, fromDate, tillDate });
		ModelAndView modelAndView = new ModelAndView("claims-list");
		modelAndView.addObject("claims", result);
		return modelAndView;
	}
	
	@RequestMapping(value = "/secure/claim-info")
	public ModelAndView loadClaimDetailsForm(
			@RequestParam(value = "claim_id") String claimId,
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
		List<Map<String,Object>> result = jdbcTemplate.queryForList(QueryConstants.getClaimDetailsQuery,
				new Object[] { claimId });
		ModelAndView modelAndView = new ModelAndView("claim-info");
		modelAndView.addObject("claimDetails", result);
		return modelAndView;
	}
}

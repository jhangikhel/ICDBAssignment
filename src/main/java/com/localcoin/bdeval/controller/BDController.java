package com.localcoin.bdeval.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.localcoin.bdeval.entity.AtmCashPickup;
import com.localcoin.bdeval.service.CashPickUpService;

@Controller
@RequestMapping("/api/v1")
public class BDController {
	
	@Autowired
	CashPickUpService cashPickupService;

	@ResponseBody
	@GetMapping(path = "/search_ranges", produces = "application/json")
	public List<AtmCashPickup> searchRanges() {

		//List<RangeInfoVO> result = new ArrayList<RangeInfoVO>();
		
			
		//return result;
		
		return cashPickupService.getAllData();

	}

}

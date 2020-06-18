package com.localcoin.bdeval.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.localcoin.bdeval.entity.AtmCashPickup;
import com.localcoin.bdeval.repository.CashPickupRepository;

@Service
public class CashPickUpService {

	@Autowired
	CashPickupRepository cashPickupRepository;

	@SuppressWarnings("unchecked")
	public List<AtmCashPickup> getAllData() {

		@SuppressWarnings("rawtypes")
		List li = new ArrayList();
		boolean bool = false;

		List<AtmCashPickup> cashData = new ArrayList<AtmCashPickup>();
		cashPickupRepository.findAll().forEach(cashData1 -> cashData.add(cashData1));
		
		for (int i = 0; i < cashData.size(); i++) {
			li.add(cashData.get(i).getAtmIdentifier());
			if (cashData.get(i).getActualPickup() == null) {

				li.add("Expected Pickup: " + cashData.get(i).getExpectedPickup());

			} else {

				li.add("Expected Pickup: " + cashData.get(i).getExpectedPickup());
				li.add("Actual Pickup: " + cashData.get(i).getActualPickup());
			}

		}
		return li;
	}

}

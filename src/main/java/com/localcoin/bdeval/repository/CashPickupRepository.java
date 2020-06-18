package com.localcoin.bdeval.repository;

import org.springframework.data.repository.CrudRepository;

import com.localcoin.bdeval.entity.AtmCashPickup;

public interface CashPickupRepository extends CrudRepository<AtmCashPickup, Integer> {

}

package com.aaruu.datajpa.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aaruu.datajpa.entity.Bank;

@Repository
public interface BankRepo extends CrudRepository<Bank, Integer> {

}

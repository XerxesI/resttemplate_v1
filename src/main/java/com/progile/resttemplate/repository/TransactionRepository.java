package com.progile.resttemplate.repository;

import com.progile.resttemplate.dto.IssuerTransactionDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<IssuerTransactionDao, Integer> {
}

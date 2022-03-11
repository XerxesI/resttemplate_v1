package com.progile.resttemplate.controller;

import com.progile.resttemplate.dto.IssuerTransactionDao;
import com.progile.resttemplate.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final TransactionRepository transactionRepository;

    @GetMapping("/transactions")
    public List<IssuerTransactionDao> getAllTranscations() {
        return transactionRepository.findAll();
    }

}

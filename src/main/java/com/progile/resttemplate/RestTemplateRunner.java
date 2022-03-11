package com.progile.resttemplate;

import com.progile.resttemplate.dto.IssuerTransactionDao;
import com.progile.resttemplate.dto.IssuerTransactionMapper;
import com.progile.resttemplate.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class RestTemplateRunner implements CommandLineRunner {

    @Autowired
    public TransactionRepository transactionRepository;

    private final String GET_ALL_TRANSACTIONS_API = "https://test.estcard.ee/acquiring/clearing-service/rest/v1/issuer/transaction/info/2022-01-22";
    RestTemplate restTemplate = new RestTemplate();

    // create headers
    HttpHeaders headers = new HttpHeaders();

    @Override
    public void run(String... args) throws Exception {

        transactionRepository.saveAll(getTransactions());

    }
        private List<IssuerTransactionDao> getTransactions() {
            // add basic authentication header
            headers.setBasicAuth("clearing-issuing", "9088cdc5-4d76-4494-9ef6-60dee2bb2e2f");

            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

            // build the request
            HttpEntity request = new HttpEntity(headers);
            ResponseEntity<IssuerTransactionDao[]> response = restTemplate.exchange(
                    GET_ALL_TRANSACTIONS_API,
                    HttpMethod.GET,
                    request,
                    IssuerTransactionDao[].class
            );
            // check response
            if (response.getStatusCode() == HttpStatus.OK) {
                System.out.println("Request Successful.");
                System.out.println(Arrays.stream(response.getBody())
                        .map(r->r.getPan())
                        .collect(Collectors.toList()));
            } else {
                System.out.println("Request Failed");
                System.out.println(response.getStatusCode());
            }

            IssuerTransactionDao[] transactionArray = response.getBody();


        return Arrays.stream(transactionArray)
                .collect(Collectors.toList());
    }

}

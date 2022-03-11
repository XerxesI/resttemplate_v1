package com.progile.resttemplate.dto;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IssuerTransactionMapper {

    IssuerTransactionDto issuerTransactionDaoToDto(IssuerTransactionDao issuerTransactionDao);
}

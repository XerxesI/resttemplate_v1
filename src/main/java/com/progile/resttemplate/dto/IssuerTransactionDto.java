package com.progile.resttemplate.dto;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class IssuerTransactionDto {
    private Integer eccfMessageId;

    private String iccRelDat;

    private String posFile;

    private String fileType;

    private String fileId;

    private LocalDate entryDate;

    private Integer status;

    private String mtid;

    private String fcode;

    private String messnr;

    private String pan;

    private String procCode;

    private Integer amtran;

    private Integer amrecon;

    private String conrrecon;

    private String stan;

    private String dtloctran;

    private String dexp;

    private String dcon;

    private String posdcode;

    private String csn;

    private String mrCode;

    private String cabCode;

    private String drecon;

    private String reconInd;

    private String amntorig;

    private String acqRefDat;

    private String acqInidc;

    private String forInidc;

    private String retrefNr;

    private String apprCode;

    private String actCode;

    private String catmId;

    private String caic;

    private String can;

    private String amountFee;

    private String currencyTransaction;

    private String currencyConversion;

    private String originalDate;

    private String dataRecord;

    private String cirefDat;

    private String recInId;

    private String transactionDescription;

    private String errorCodes;

    private Date transactionDate;

    private Integer amntcBill;

    private String curcBill;

    private String format;

    private String f_62;

    private String f_123;

    private String f_48;

    private String f_63;

    private String f_73;

    private String acquirerBin;

    private String o_r;

    private String f_54;

    private String merchant;

//    @Column(name = "MASK_PAN")
//    private String maskedPan;

}

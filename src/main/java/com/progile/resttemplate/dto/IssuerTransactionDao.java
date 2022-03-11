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
@Entity
@Builder
@Table(name = "API_MC_ISSUING_VIEW")
public class IssuerTransactionDao {
    @Id
    @Column(name = "ECCF_MSG_ID")
    private Integer eccfMessageId;

    @Column(name = "ICCSRELDAT")
    private String iccRelDat;

    @Column(name = "POSFILE")
    private String posFile;

    @Column(name = "FILE_TYPE")
    private String fileType;

    @Column(name = "FILE_ID")
    private String fileId;

    @Column(name = "ENTRY_DATE")
    private LocalDate entryDate;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "MTID")
    private String mtid;

    @Column(name = "FCODE")
    private String fcode;

    @Column(name = "MESSNR")
    private String messnr;

    @Column(name = "PAN")
    private String pan;

    @Column(name = "PROCCODE")
    private String procCode;

    @Column(name = "AMTRAN")
    private Integer amtran;

    @Column(name = "AMRECON")
    private Integer amrecon;

    @Column(name = "CONRRECON")
    private String conrrecon;

    @Column(name = "STAN")
    private String stan;

    @Column(name = "DTLOCTRAN")
    private String dtloctran;

    @Column(name = "DEXP")
    private String dexp;

    @Column(name = "DCON")
    private String dcon;

    @Column(name = "POSDCODE")
    private String posdcode;

    @Column(name = "CSN")
    private String csn;

    @Column(name = "MRCODE")
    private String mrCode;

    @Column(name = "CABCODE")
    private String cabCode;

    @Column(name = "DRECON")
    private String drecon;

    @Column(name = "RECONIND")
    private String reconInd;

    @Column(name = "AMNTORIG")
    private String amntorig;

    @Column(name = "ACQREFDAT")
    private String acqRefDat;

    @Column(name = "ACQINIDC")
    private String acqInidc;

    @Column(name = "FORINIDC")
    private String forInidc;

    @Column(name = "RETREFNR")
    private String retrefNr;

    @Column(name = "APPRCODE")
    private String apprCode;

    @Column(name = "ACTCODE")
    private String actCode;

    @Column(name = "CATMID")
    private String catmId;

    @Column(name = "CAIC")
    private String caic;

    @Column(name = "CAN")
    private String can;

    @Column(name = "AMNTFEE")
    private String amountFee;

    @Column(name = "CURTRAN")
    private String currencyTransaction;

    @Column(name = "CURRECON")
    private String currencyConversion;

    @Column(name = "ORIGDAT")
    private String originalDate;

    @Column(name = "DATAREC")
    private String dataRecord;

    @Column(name = "CIREFDAT")
    private String cirefDat;

    @Column(name = "RECINID")
    private String recInId;

    @Column(name = "TRANDESCR")
    private String transactionDescription;

    @Column(name = "ERR_CODES")
    private String errorCodes;

    @Column(name = "TR_DATE")
    private Date transactionDate;

    @Column(name = "AMNTCBILL")
    private Integer amntcBill;

    @Column(name = "CURCBILL")
    private String curcBill;

    @Column(name = "FORMAT")
    private String format;

    @Column(name = "F_62")
    private String f_62;

    @Column(name = "F_123")
    private String f_123;

    @Column(name = "F_48")
    private String f_48;

    @Column(name = "F_63")
    private String f_63;

    @Column(name = "F_73")
    private String f_73;

    @Column(name = "ACQ_BIN")
    private String acquirerBin;

    @Column(name = "O_R")
    private String o_r;

    @Column(name = "F_54")
    private String f_54;

    @Column(name = "MERCHANT")
    private String merchant;

//    @Column(name = "MASK_PAN")
//    private String maskedPan;

}

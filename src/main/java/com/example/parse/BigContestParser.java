package com.example.parse;

import org.apache.hadoop.io.Text;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class BigContestParser {

	private Integer CUST_ID = 0;
	private int TARGET = 0;
	private long BNK_LNIF_CNT = 0;
	private long CPT_LNIF_CNT = 0;
	private long SPART_LNIF_CNT = 0;
	private long ECT_LNIF_CNT = 0;
	private long TOT_LNIF_AMT = 0;
	private long TOT_CLIF_AMT = 0;
	private long BNK_LNIF_AMT = 0;
	private long CPT_LNIF_AMT = 0;
	private int CRDT_OCCR_MDIF = 0;
	private int SPTCT_OCCR_MDIF = 0;
	private long CRDT_CARD_CNT = 0;
	private int CTCD_OCCR_MDIF = 0;
	private long CB_GUIF_CNT = 0;
	private long CB_GUIF_AMT = 0;
	private String OCCP_NAME_G = ""; // Null,* 있음 값 필터링 필요.
	private long CUST_JOB_INCM = 0;
	private long HSHD_INFR_INCM = 0;
	private int ACTL_FMLY_NUM = 0;
	private int CUST_FMLY_NUM = 0;
	private int LAST_CHLD_AGE = 0;
	private String MATE_OCCP_NAME_G = ""; // Null,* 있음 값 필터링 필요.
	private long MATE_JOB_INCM = 0;
	private int CRDT_LOAN_CNT = 0;
	private String MIN_CNTT_DATE = ""; // 최초대출날짜 YYYYMM
	private Integer MIN_CNTT_DATE_Y = 0; // YYYY => null 있음
	private Integer MIN_CNTT_DATE_M = 0; // MM => null 있음
	private long TOT_CRLN_AMT = 0;
	private long TOT_REPY_AMT = 0;
	private double CRLN_OVDU_RATE = 0;
	private double CRLN_30OVDU_RATE = 0;
	private double LT1Y_CLOD_RATE = 0;
	private int STRT_CRDT_GRAD = 0;
	private int LTST_CRDT_GRAD = 0;
	private double PREM_OVDU_RATE = 0;
	private String LT1Y_PEOD_RATE = "";
	private double AVG_STLN_RATE = 0;
	private long STLN_REMN_AMT = 0;
	private long LT1Y_STLN_AMT = 0;
	private double LT1Y_SLOD_RATE = 0;
	private long GDINS_MON_PREM = 0;
	private long SVINS_MON_PREM = 0;
	private long FMLY_GDINS_MNPREM = 0;
	private long FMLY_SVINS_MNPREM = 0;
	private long MAX_MON_PREM = 0;
	private long TOT_PREM = 0;
	private long FMLY_TOT_PREM = 0;
	private long CNTT_LAMT_CNT = 0;
	private long LT1Y_CTLT_CNT = 0;
	private long AUTR_FAIL_MCNT = 0;
	private long FYCM_PAID_AMT = 0;
	private long FMLY_CLAM_CNT = 0;
	private long FMLY_PLPY_CNT = 0;
	private int AGE = 0; // Null,* 있음 값 필터링 필요.
	private char SEX = 0; // Null,* 있음 값 필터링 필요.
	private int AVG_CALL_TIME = 0;
	private int AVG_CALL_FREQ = 0;
	private String TEL_MBSP_GRAD = "";
	private long ARPU = 0;
	private long MON_TLFE_AMT = 0;
	private char CBPT_MBSP_YN = 0;
	private long MOBL_FATY_PRC = 0;
	private String TEL_CNTT_QTR = ""; // YYYYQ
	private int TEL_CNTT_QTR_Y = 0; // 가입년도 YYYY
	private int TEL_CNTT_QTR_Q = 0; // 가입분기 Q
	private int NUM_DAY_SUSP = 0;
	private long CRMM_OVDU_AMT = 0;
	private long TLFE_UNPD_CNT = 0;
	private long LT1Y_MXOD_AMT = 0;
	private String PAYM_METD = "";
	private char LINE_STUS = 0;
	private long MOBL_PRIN = 0;

	// parsing 작업
	public BigContestParser(Text text) {

		String[] columns = text.toString().split(",");

		if (!"".equals(columns[0]) && !columns[0].equals(null))
			CUST_ID = Integer.parseInt(columns[0]);
		TARGET = Integer.parseInt(columns[1]);
		BNK_LNIF_CNT = (long) Integer.parseInt(columns[2]);
		CPT_LNIF_CNT = (long) Integer.parseInt(columns[3]);
		SPART_LNIF_CNT = (long) Integer.parseInt(columns[4]);
		ECT_LNIF_CNT = (long) Integer.parseInt(columns[5]);
		TOT_LNIF_AMT = (long) Integer.parseInt(columns[6]);
		TOT_CLIF_AMT = (long) Integer.parseInt(columns[7]);
		BNK_LNIF_AMT = (long) Integer.parseInt(columns[8]);
		CPT_LNIF_AMT = (long) Integer.parseInt(columns[9]);
		CRDT_OCCR_MDIF = Integer.parseInt(columns[10]);
		SPTCT_OCCR_MDIF = Integer.parseInt(columns[11]);
		CRDT_CARD_CNT = (long) Integer.parseInt(columns[12]);
		CTCD_OCCR_MDIF = Integer.parseInt(columns[13]);
		CB_GUIF_CNT = (long) Integer.parseInt(columns[14]);
		CB_GUIF_AMT = (long) Integer.parseInt(columns[15]);
		if (!"".equals(columns[16]) && !columns[16].equals(null))
			OCCP_NAME_G = columns[16]; // *있음.

		CUST_JOB_INCM = (long) Integer.parseInt(columns[17]);
		HSHD_INFR_INCM = (long) Integer.parseInt(columns[18]);
		ACTL_FMLY_NUM = Integer.parseInt(columns[19]);
		CUST_FMLY_NUM = Integer.parseInt(columns[20]);
		LAST_CHLD_AGE = Integer.parseInt(columns[21]);
		if (!"".equals(columns[22]) && !columns[22].equals(null))
			MATE_OCCP_NAME_G = columns[22]; // *있음.

		MATE_JOB_INCM = (long) Integer.parseInt(columns[23]);
		CRDT_LOAN_CNT = Integer.parseInt(columns[24]);
		if (!"".equals(columns[25]) && !columns[25].equals(null)) {
			MIN_CNTT_DATE = columns[25]; // YYYYMM
			// 가입년 : YYYY (정수형)
			MIN_CNTT_DATE_Y = Integer.parseInt(MIN_CNTT_DATE.substring(0, 3));
			// 가입월 : MM 정수형
			MIN_CNTT_DATE_M = Integer.parseInt(MIN_CNTT_DATE.substring(4));
		} else {
			MIN_CNTT_DATE_Y = 0; // 값이 0일 경우 가입년도 Null값 입력
			MIN_CNTT_DATE_M = 0; // 값이 0일 경우 가입월 Null값 입력
		}
		TOT_CRLN_AMT = (long) Integer.parseInt(columns[26]);
		TOT_REPY_AMT = (long) Integer.parseInt(columns[27]);
		CRLN_OVDU_RATE = (double) Integer.parseInt(columns[28]);
		CRLN_30OVDU_RATE = (double) Integer.parseInt(columns[29]);
		LT1Y_CLOD_RATE = (double) Integer.parseInt(columns[30]);
		STRT_CRDT_GRAD = Integer.parseInt(columns[31]);
		LTST_CRDT_GRAD = Integer.parseInt(columns[32]);
		PREM_OVDU_RATE = (double) Integer.parseInt(columns[33]);
		LT1Y_PEOD_RATE = columns[34]; // 0, 10미만 ~ 90미만 ++10
		AVG_STLN_RATE = (double) Integer.parseInt(columns[35]);
		STLN_REMN_AMT = (long) Integer.parseInt(columns[36]);
		LT1Y_STLN_AMT = (long) Integer.parseInt(columns[37]);
		LT1Y_SLOD_RATE = (double) Integer.parseInt(columns[38]);
		GDINS_MON_PREM = (long) Integer.parseInt(columns[39]);
		SVINS_MON_PREM = (long) Integer.parseInt(columns[40]);
		FMLY_GDINS_MNPREM = (long) Integer.parseInt(columns[41]);
		FMLY_SVINS_MNPREM = (long) Integer.parseInt(columns[42]);
		MAX_MON_PREM = (long) Integer.parseInt(columns[43]);
		TOT_PREM = (long) Integer.parseInt(columns[44]);
		FMLY_TOT_PREM = (long) Integer.parseInt(columns[45]);
		CNTT_LAMT_CNT = (long) Integer.parseInt(columns[46]);
		LT1Y_CTLT_CNT = (long) Integer.parseInt(columns[47]);
		AUTR_FAIL_MCNT = (long) Integer.parseInt(columns[48]);
		FYCM_PAID_AMT = (long) Integer.parseInt(columns[49]);
		FMLY_CLAM_CNT = (long) Integer.parseInt(columns[50]);
		FMLY_PLPY_CNT = (long) Integer.parseInt(columns[51]);
		if (!columns[52].equals("*") && !"".equals(columns[52]) && !columns[52].equals(null)) {
			AGE = Integer.parseInt(columns[52]); // AGE ( 정수형, 20 ~ 70,
													// ++5, *값 있음 )
		} else { // * 일 때 어떻게 처리할 것인가?
		}
		if (columns[53].equals("1") && !"".equals(columns[53]) && !columns[53].equals(null)) { // SEX
																								// (1
																								// :
																								// 남자
																								// =>
																								// M)
			SEX = 'M';
		} else if (columns[53].equals("2")) { // SEX (2 : 여자 => F)
			SEX = 'F';
		} else { // * 일 때 어떻게 처리할 것인가?
		}
		AVG_CALL_TIME = Integer.parseInt(columns[54]);
		AVG_CALL_FREQ = Integer.parseInt(columns[55]);
		if (!"".equals(columns[56]) && !columns[56].equals(null)) {
			TEL_MBSP_GRAD = columns[56];
		} else {
			TEL_MBSP_GRAD = "0";
		}
		ARPU = (long) Integer.parseInt(columns[57]);
		MON_TLFE_AMT = (long) Integer.parseInt(columns[58]);
		CBPT_MBSP_YN = columns[59].charAt(0); // Y,N (Only)
		MOBL_FATY_PRC = (long) Integer.parseInt(columns[60]);
		TEL_CNTT_QTR = columns[61]; // 가입년월_분기단위: YYYYQ
		// 가입년 : YYYY (정수형)
		TEL_CNTT_QTR_Y = Integer.parseInt(columns[61].substring(0, 3));
		// 가입분기 : Q (정수형)
		TEL_CNTT_QTR_Q = Integer.parseInt(columns[61].substring(4));
		NUM_DAY_SUSP = Integer.parseInt(columns[62]);
		CRMM_OVDU_AMT = (long) Integer.parseInt(columns[63]);
		TLFE_UNPD_CNT = (long) Integer.parseInt(columns[64]);
		LT1Y_MXOD_AMT = (long) Integer.parseInt(columns[65]);
		if (!"".equals(columns[66]) && !columns[66].equals(null))
			PAYM_METD = columns[66];
		LINE_STUS = columns[67].charAt(0); // U,S (Only)
		MOBL_PRIN = (long) Integer.parseInt(columns[68]);

	}

}

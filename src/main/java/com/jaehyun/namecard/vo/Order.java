package com.jaehyun.namecard.vo;
import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 주문 
@Getter @Setter @ToString
public class Order {

	// 주문번호
	private int ordId;

	// 사원번호
	private int empId;

	// 주문일자
	private Timestamp ordDt;

	// 긴급여부코드
	private String emgDvCd;
}
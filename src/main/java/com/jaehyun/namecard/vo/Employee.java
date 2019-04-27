package com.jaehyun.namecard.vo;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Employee {

	private int empId;
	private String empNm;
	private String empEmail;

}

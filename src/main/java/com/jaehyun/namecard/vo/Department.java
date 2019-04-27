package com.jaehyun.namecard.vo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "DEPT")
@Getter
@Setter
@ToString
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptId;
	private String deptNm;
	
	@CreationTimestamp
	private @Column(name = "cdate") Timestamp cdate;

	@UpdateTimestamp
	private @Column(name = "udate") Timestamp udate;

}

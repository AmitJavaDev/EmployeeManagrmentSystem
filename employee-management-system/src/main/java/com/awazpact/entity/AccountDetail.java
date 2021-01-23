package com.awazpact.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp_Acc_Tbl")
public class AccountDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accId;
	@Column(unique = true,nullable = false)
	private int accNumber;
	private String accName;
	private String branch;
	private String ifsc;
	public AccountDetail() {
		super();
	}
	public AccountDetail(int accId, int accNumber, String accName, String branch, String ifsc) {
		super();
		this.accId = accId;
		this.accNumber = accNumber;
		this.accName = accName;
		this.branch = branch;
		this.ifsc = ifsc;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	
}

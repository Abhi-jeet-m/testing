package com.idflp;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Service_Master")
public class Service_Master {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "SL_NO")
	private int SL_NO;
	
	@Column(name = "SERVICE_NAME", length = 50, columnDefinition = "varchar(50) default ''")
	private String SERVICE_NAME;
	
	@Column(name = "SERVICE_DESCRIPTION", length = 255, columnDefinition = "varchar(255) default ''")
	private String SERVICE_DESCRIPTION;
	
	@Column(name = "DATE_TIME")
	private Timestamp DATE_TIME;
	
	@Column(name = "ENABLE_STATUS", length = 5, columnDefinition = "int(5) default 1")
	private int ENABLE_STATUS;
	
	@Column(name = "MODIFIED_DATE")
	private	Timestamp MODIFIED_DATE;
	
	@Column(name = "MODIFIED_BY", length = 50, columnDefinition = "varchar(50) default ''")
	private String MODIFIED_BY;

	public int getSL_NO() {
		return SL_NO;
	}

	public void setSL_NO(int sL_NO) {
		SL_NO = sL_NO;
	}

	public String getSERVICE_NAME() {
		return SERVICE_NAME;
	}

	public void setSERVICE_NAME(String sERVICE_NAME) {
		SERVICE_NAME = sERVICE_NAME;
	}

	public Timestamp getDATE_TIME() {
		return DATE_TIME;
	}

	public void setDATE_TIME(Timestamp dATE_TIME) {
		DATE_TIME = dATE_TIME;
	}

	public int getENABLE_STATUS() {
		return ENABLE_STATUS;
	}

	public void setENABLE_STATUS(int eNABLE_STATUS) {
		ENABLE_STATUS = eNABLE_STATUS;
	}

	public Timestamp getMODIFIED_DATE() {
		return MODIFIED_DATE;
	}

	public void setMODIFIED_DATE(Timestamp mODIFIED_DATE) {
		MODIFIED_DATE = mODIFIED_DATE;
	}

	public String getMODIFIED_BY() {
		return MODIFIED_BY;
	}

	public void setMODIFIED_BY(String mODIFIED_BY) {
		MODIFIED_BY = mODIFIED_BY;
	}

	public String getSERVICE_DESCRIPTION() {
		return SERVICE_DESCRIPTION;
	}

	public void setSERVICE_DESCRIPTION(String sERVICE_DESCRIPTION) {
		SERVICE_DESCRIPTION = sERVICE_DESCRIPTION;
	}
	
}

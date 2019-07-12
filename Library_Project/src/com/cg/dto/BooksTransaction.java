package com.cg.dto;

import java.sql.Date;

public class BooksTransaction {

	private int trans_id;
	private int reg_id;
	private Date issue_date;
	private Date return_date;
	private int fine;
	public BooksTransaction(int trans_id, int reg_id, Date issue_date,
			Date return_date, int fine) {
		super();
		this.trans_id = trans_id;
		this.reg_id = reg_id;
		this.issue_date = issue_date;
		this.return_date = return_date;
		this.fine = fine;
	}
	public int getTrans_id() {
		return trans_id;
	}
	public void setTrans_id(int trans_id) {
		this.trans_id = trans_id;
	}
	public int getReg_id() {
		return reg_id;
	}
	public void setReg_id(int reg_id) {
		this.reg_id = reg_id;
	}
	public Date getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}
	public Date getReturn_date() {
		return return_date;
	}
	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}
	public int getFine() {
		return fine;
	}
	public void setFine(int fine) {
		this.fine = fine;
	}
	@Override
	public String toString() {
		return "BooksTransaction [trans_id=" + trans_id + ", reg_id=" + reg_id
				+ ", issue_date=" + issue_date + ", return_date=" + return_date
				+ ", fine=" + fine + "]";
	}

 
}

package com.wipro.ccbill.entity;

import java.util.Date;

import com.wipro.ccbill.exception.InputValidationException;

public class CreditCardBill {
	private String creditCardNo;
	private String customerId;
	private Date billDate;
	private Transaction monthTransactions[];
	public double getTotalAmount(String transactionType){
		for(int i =0;i<monthTransactions.length;i++){
			if(transactionType =="DB"|| transactionType=="CR"){
				return getTotalAmount(transactionType);
			}
		}
		
		return 0;}
	public double calculateBillAmount() throws InputValidationException{
		if( validateData()=="valid")
			{
			if(monthTransactions!=null && monthTransactions.length>0){
				getTotalAmount("DB");
				getTotalAmount("CR");
				 double outstanding = getTotalAmount("DB")-
				getTotalAmount("CR");
				 double percent= (19.9)/100;
				 double interest =(outstanding * percent/12);
				 double  billAmount=outstanding +interest;
				 return billAmount;	
			}
			}
		 
		return 0.0;}

	public String getCreditCardNo() {
		return creditCardNo;
	}
	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public Transaction[] getMonthTransactions() {
		return monthTransactions;
	}
	public void setMonthTransactions(Transaction monthTransactions[]) {
		this.monthTransactions = monthTransactions;
	}
	
	

	public CreditCardBill (){
	}
	public CreditCardBill (String creditCardNo, String customerId, Date BillDate, Transaction monthTransactions[]){
		
	}
	public String validateData() throws InputValidationException{
		
			
		if(creditCardNo!=null && creditCardNo.length()==16){
			if(customerId!=null &&customerId.length()>6){
				return "valid";
			}
		}
		else {
			throw  new InputValidationException();
		}
		return null;
		
		}
		

	}


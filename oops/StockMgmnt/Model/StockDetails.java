package com.bridgeLabz.ObjectOriented;

public class StockDetails {
	private String companyName;
	private String companySymbol;
	private int numberOfShare;
	private double price;
	
	
	  public StockDetails( String companySymbol,String companyName, int numberOfShare  ,double price) {
		  // super();
		this.companyName = companyName;
		this.companySymbol=companySymbol;
		this.numberOfShare = numberOfShare;
		this.price = price;

	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public int getNumberOfShare() {
		return numberOfShare;
	}
	public void setNumberOfShare(int numberOfShare) {
		this.numberOfShare = numberOfShare;
	}
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public String getcompanySymbol() {
		return companySymbol;
	}
	public void setcompanySymbol(String companySymbol) {
		this.companySymbol = companySymbol;

	}
}

package com.bridgeLabz.ObjectOriented;

import java.io.File;

public interface StockOperation {
 void BuyShare(Double amount,String Stock_Names,File Filewrite);
 void SellShare(Double amount,String Stock_Names,File Filewrite);
 void RemoveDetails(String Stock_Names);
 void AddDetails(File file,StockDetails StockDetails);
 void printCompanyDetails();
}

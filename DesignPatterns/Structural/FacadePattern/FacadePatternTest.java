package com.bridgelabz.Structural;

import java.sql.Connection;

public class FacadePatternTest {

public static void main(String[] args) {
	String tableName = "Employees";
	Connection con = MySqlHelper.getMySqlDBConnection();
	MySqlHelper Sql = new MySqlHelper();
	Sql.generateMySqlHTMLReport(tableName, con);
	Sql.generateMySqlHTMLReport(tableName, con);
	Connection con1 = MyOracleHelper.MyOracleDBConnection();
MyOracleHelper Oracle = new MyOracleHelper();
Oracle.generateMyOracleHTMLReport(tableName, con1);
Oracle.generateMyOraclePDFReport(tableName, con1);

FacadeHelper.getData(FacadeHelper.DBType.MYSQL,FacadeHelper.Reportype.HTML,tableName);
}
}
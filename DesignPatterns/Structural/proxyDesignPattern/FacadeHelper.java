package com.bridgelabz.Structural;
import java.sql.Connection;
public class FacadeHelper {
	
	public static void getData(DBType dbType,Reportype reportType,String tableName) {
		Connection con = null;
		switch(dbType) {
		case MYSQL:
			con = MySqlHelper.getMySqlDBConnection();
			MySqlHelper sql = new MySqlHelper();
			switch(reportType) {
			case PDF:
			  sql.generateMySqlPDFReport(tableName, con);
			break;
			case HTML:
				sql.generateMySqlHTMLReport(tableName, con);
				break;			
			}
			break;
		case ORACLE:
			con = MySqlHelper.getMySqlDBConnection();
			MyOracleHelper oracle = new MyOracleHelper();
			switch(reportType) {
			case PDF:
			  oracle.generateMyOraclePDFReport(tableName, con);
			  break;
			case HTML:
				oracle.generateMyOracleHTMLReport(tableName, con);
				break;
			}
			break;
			}
		}
public static enum DBType {
	MYSQL , ORACLE;
	}
public enum Reportype {
	PDF,HTML;
}

}


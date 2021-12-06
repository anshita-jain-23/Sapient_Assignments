package com.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.bean.Account;

public class AccountDaoImpl implements AccountDao {
	@Override
	public ArrayList<Account> getAllAccount() {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ArrayList<Account> accountList=new ArrayList<Account>();
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "Muskan");
			
//			2. Query
			preparedStatement=connection.prepareStatement("SELECT * FROM ACCOUNT");
			
			ResultSet resultSet= preparedStatement.executeQuery();

//			3.Process Result
			while(resultSet.next()) {
				int accno=resultSet.getInt("ACCNO");
				String accname=resultSet.getString("ACCNAME");
				String acctype=resultSet.getString("ACCTYPE");
				int accbal=resultSet.getInt("BALANCE");
				Account account=new Account(accno, accname, acctype, accbal);
				accountList.add(account);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
//				4. Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		return accountList;
	}

	@Override
	public Account getAccountById(int num) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Account account=null;
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "Muskan");
			
//			2. Query
			preparedStatement=connection.prepareStatement("SELECT * FROM ACCOUNT WHERE ACCNO=?");
			
			preparedStatement.setInt(1, num);
			
			ResultSet resultSet= preparedStatement.executeQuery();

//			3.Process Result
			
			if(resultSet.next()) {
				int accno=resultSet.getInt("ACCNO");
				String accname=resultSet.getString("ACCNAME");
				String acctype=resultSet.getString("ACCTYPE");
				int accbal=resultSet.getInt("BALANCE");
				account=new Account(accno, accname, acctype, accbal);
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
//				4. Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return account;
	}

	@Override
	public int addAccount(Account account) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Scanner scanner=new Scanner(System.in);
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "Muskan");
			
//			2. Query
			preparedStatement=connection.prepareStatement("INSERT INTO ACCOUNT VALUES(?,?,?,?)");
			
			preparedStatement.setInt(1, account.getAccNo());
			preparedStatement.setString(2, account.getAccName());
			preparedStatement.setString(3, account.getAccType());
			preparedStatement.setInt(4, account.getBalance());
			
			
			int rows= preparedStatement.executeUpdate();

//			3.Process Result
			return rows;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
//				4. Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return 0;
	}

	@Override
	public int deleteAccount(int num) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Scanner scanner=new Scanner(System.in);
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "Muskan");
			
//			2. Query
			preparedStatement=connection.prepareStatement("DELETE FROM ACCOUNT WHERE ACCNO=?");
			
			preparedStatement.setInt(1, num);

			int rows= preparedStatement.executeUpdate();

//			3.Process Result
			return rows;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
//				4. Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return 0;
	}
	
	@Override
	public int updateAccountByAccNo(int num, String name) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Scanner scanner=new Scanner(System.in);
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "Muskan");
			
//			2. Query
			preparedStatement=connection.prepareStatement("UPDATE ACCOUNT SET ACCNAME=? WHERE ACCNO=?");

			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, num);
			
			int rows= preparedStatement.executeUpdate();

//			3.Process Result
			return rows;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
//				4. Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return 0;
	}
	
	
	@Override
	public int Transaction(int bal,int acc1,int acc2) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		PreparedStatement preparedStatement2=null;
		Scanner scanner=new Scanner(System.in);
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "Muskan");
			
//			2. Query
			preparedStatement=connection.prepareStatement("UPDATE ACCOUNT SET BALANCE = BALANCE - ? WHERE ACCNO = ?");
			preparedStatement2=connection.prepareStatement("UPDATE ACCOUNT SET BALANCE = BALANCE + ? WHERE ACCNO = ?");
			
			preparedStatement.setInt(1, bal);
			preparedStatement.setInt(2, acc1);
			
			preparedStatement2.setInt(1, bal);
			preparedStatement2.setInt(2, acc2);
			
			
			int rows= preparedStatement.executeUpdate();

//			3.Process Result
			return rows;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
//				4. Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return 0;
	}


}

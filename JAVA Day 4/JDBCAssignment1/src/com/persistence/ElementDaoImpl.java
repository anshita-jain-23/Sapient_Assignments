package com.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.bean.Element;

public class ElementDaoImpl implements ElementDao {
	@Override
	public ArrayList<Element> getAllElements() {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ArrayList<Element> elementList=new ArrayList<Element>();
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "Muskan");
			
//			2. Query
			preparedStatement=connection.prepareStatement("SELECT * FROM ELEMENT");
			
			ResultSet resultSet= preparedStatement.executeQuery();

//			3.Process Result
			while(resultSet.next()) {
				String w=resultSet.getString("WEIGHT");
				String n =resultSet.getString("NAME");
				String s=resultSet.getString("SYMBOL");
				Element element=new Element(w,n,s);
				elementList.add(element);
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


		return elementList;
	}

	@Override
	public Element getElementByName(String name) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Element element=null;
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "Muskan");
			
//			2. Query
			preparedStatement=connection.prepareStatement("SELECT * FROM ELEMENT WHERE NAME=?");
			
			preparedStatement.setString(1, name);
			
			ResultSet resultSet= preparedStatement.executeQuery();

//			3.Process Result
			
			if(resultSet.next()) {
				String w=resultSet.getString("WEIGHT");
				String n=resultSet.getString("NAME");
				String s=resultSet.getString("SYMBOL");

				
				element=new Element(w, n, s);
				
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

		return element;
	}

	@Override
	public int addElement(Element element) {
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
			preparedStatement=connection.prepareStatement("INSERT INTO ELEMENT VALUES(?,?,?)");
			
			preparedStatement.setString(1, element.getWeight());
			preparedStatement.setString(2, element.getName());
			preparedStatement.setString(3, element.getSymbol());
			
			
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
	public int deleteElement(String name) {
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
			preparedStatement=connection.prepareStatement("DELETE FROM ELEMENT WHERE NAME=?");
			
			preparedStatement.setString(1, name);

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
	public int updateElement(String w, String n) {
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
			preparedStatement=connection.prepareStatement("UPDATE ELEMENT SET WEIGHT=? WHERE NAME=?");
			
			preparedStatement.setString(1, w);
			preparedStatement.setString(2, n);
			
			
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

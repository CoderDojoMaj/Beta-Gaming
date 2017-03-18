package org.coderdojo.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexiones {

	private static FabricaConexiones laFabrica;
	
	static {
		try {
			laFabrica=new FabricaConexiones();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Arrea, el driver no se había cargado");
		}
	}
	private FabricaConexiones() throws ClassNotFoundException{
		//1 cargar el driver
		System.out.println("Loading Driver...");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Done!\n");
		
	}
	public static FabricaConexiones getFabrica(){
		return laFabrica;
	}
	public Connection dameConexion() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/betagaming","root","root");	
	}
}

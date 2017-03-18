package org.coderdojo.servlets;
import java.io.IOException;

//Import DB Driver
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//import org.apache.commons.validator.EmailValidator;//Not working from servlet?
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.coderdojo.bd.FabricaConexiones;




public class SvlCrearUsuario extends HttpServlet { //Creo que el jboss no está cargado correctamente si da error aquí
	private static final long serialVersionUID = 1L;

	
	
    public SvlCrearUsuario() {
        // TODO Auto-generated constructor stub
    	
    }

    public boolean isStrongPassword(String inputPassword) {
        // Comprueba si una contraseña es suficientemente fuerte
    	boolean check1 = false, check2 = false, check3 = false;
    	
    	//Texto suficientemente largo
    	if (inputPassword.length() >= 7)
    	{check1=true;}; 
    	
    	//Contiene algún numero
    	if (inputPassword.matches(".*\\d+.*"))
    	{check2=true;};
    	
    	//Comprueba si tiene alguna mayuscula
    	boolean hasUppercase = !inputPassword.equals(inputPassword.toLowerCase());
    	if (hasUppercase)
    	{check3 = true;};
    	
    	if(check1&&check2&&check3)
    	{return true;};
    	return false;
    	
    }
    
    public boolean userInDB(String inputUser){
    	
    	return false;
    }
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Loading Driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Done!\n");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Recibe los datos enviados por el usuario
		String username = request.getParameter("nick");
		String password = request.getParameter("pass");
		String email = request.getParameter("mail");
		String skype = request.getParameter("skype");
    	
    	boolean validUsername = false;
    	boolean validPassword = false;
    	boolean validEMAIL = false;
    	
    	//Esta logica puede estar mal
    	if ( (username.length() >= 4) && ( !userInDB(username) ) )
    	{
    		validUsername = true;
    	};
    	
    	
    	if (isStrongPassword(password))
    	{
    		validPassword = true;
    	};
    	
    	
    	//Check if the function is imported correctly
    	/*
    	EmailValidator validator = EmailValidator.getInstance(); Añadir if email not in database
    	if (validator.isValid(email))
    	{
    		validEMAIL = true;
    	};*/
    	
    	if( validUsername && validPassword && validEMAIL )
    	{
    		//writeDatabase(); Writes Username, hash, etc..
    		htmlDebug("hola", response);
    		//1 pedimos la fabrica
    		FabricaConexiones laFabria=FabricaConexiones.getFabrica();
    		//pedimios una conexión
    		try {
				Connection conexion=laFabria.dameConexion();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		//RequestStatement rs;
    		String myQuery = "insert into table usuarios(name,login,pass) values (?,?)";
    		response.sendRedirect("loginSuccess.html");
    	}
    	else
    	{
    		
    		response.sendRedirect("loginError.html");
    	};
		
    	
	}

}

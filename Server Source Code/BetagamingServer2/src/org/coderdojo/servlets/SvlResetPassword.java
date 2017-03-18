package org.coderdojo.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import org.coderdojo.utils.SessionIdentifierGenerator;


//Import DB Driver
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class SvlResetPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SvlResetPassword() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	public boolean exists_in_db(String data)
	{
		return true;
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			System.out.println("Loading Driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Done!\n");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Get The user email
		String targetEmail = request.getParameter("targetEmail");
		boolean check1 = false;
		
		//Check if the email exists in our user database
		if (exists_in_db(targetEmail))
		{
			check1 = true;
		};
		
		//Generates new random secure password
		SessionIdentifierGenerator var = new SessionIdentifierGenerator();
		String newRandomPassword = var.nextSessionId();
		
		//Envia email TODO
		//sendRecoverEmail(targetEmail, newRandomPassword);
		
		//Limpia
		htmlDebug("Recovery Completed", response);
		response.sendRedirect("index.html");
		
		
		
		
	}

}

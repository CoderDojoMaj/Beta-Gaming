package org.coderdojo.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SvlChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SvlChangePassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
		String oldPass = request.getParameter("oldPass");
		String newPass = request.getParameter("newPass");
		
		
	}

}

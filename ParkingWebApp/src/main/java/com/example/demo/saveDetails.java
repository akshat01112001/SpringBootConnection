package com.example.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@WebServlet(value="/saveDetails")
@RequestMapping(value="<%=request.getContextPath()%>/saveDetails", method=RequestMethod.POST)
public class saveDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public saveDetails()
	{
		super();
	}

	@RequestMapping(method=RequestMethod.POST)
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Begin");
		String FirstName=request.getParameter("FirstName");
		String LastName=request.getParameter("LastName");
		String Username=request.getParameter("Username");
		String Email=request.getParameter("Email");
		String Phone=request.getParameter("Phone");
		String CarReg=request.getParameter("CarReg");
		String Address=request.getParameter("Address");
		
		RegistrationDetails object=new RegistrationDetails();
		object.setAddress(Address);
		object.setEmail(Email);
		object.setFirstName(FirstName);
		object.setLastName(LastName);
		object.setPhone(Phone);
		object.setRegNo(CarReg);
		object.setUsername(Username);
		System.out.println("Out");
		System.out.println(object.getEmail());
		
	}
	
/*public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
			System.out.println("Begin");
			String FirstName=request.getParameter("FirstName");
			String LastName=request.getParameter("LastName");
			String Username=request.getParameter("Username");
			String Email=request.getParameter("Email");
			String Phone=request.getParameter("Phone");
			String CarReg=request.getParameter("CarReg");
			String Address=request.getParameter("Address");
			
			RegistrationDetails object=new RegistrationDetails();
			object.setAddress(Address);
			object.setEmail(Email);
			object.setFirstName(FirstName);
			object.setLastName(LastName);
			object.setPhone(Phone);
			object.setRegNo(CarReg);
			object.setUsername(Username);
			
			System.out.println("Out");
			System.out.println(object.getEmail());
	
		
	}*/

}

package com.fbook1.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class FbookController implements FbookControlleInterface  {
     
	BufferedReader br;
	public void createProfile() {
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.println("Enter your name:");
		String name = br.readLine();
		System.out.println("Enter your password:");
		String password = br.readLine();
		System.out.println("Enter your email:");
		String email= br.readLine();
		System.out.println("Enter your city:");
		String city = br.readLine();
		System.out.println("Profile Created!!!");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public void editProfile() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));

	   System.out.println("Enter Your Password:");
	   String password = br.readLine();
	  int c = Integer.parseInt(password);
	   if(c==1234)
	   {
		   System.out.println("Enter Your New Password:");
		   String b= br.readLine();
		   System.out.println("Password is updated.....");
	   }
	   else {
	   System.out.println("Your password is Wrong... Please try again.....");
	   }		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void viewProfile() {
		// TODO Auto-generated method stub
		
	}
	public void loginProfile() {
		// TODO Auto-generated method stub
		
	}
	public void searchProfile() {
		// TODO Auto-generated method stub
		
	}
	public void deleteProfile() {
		// TODO Auto-generated method stub
		
	}
	public void logoutprofile() {
		  
		  System.out.println("Logout Successfully.....");
		
	}
}

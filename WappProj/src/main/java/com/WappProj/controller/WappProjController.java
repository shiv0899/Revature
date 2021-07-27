package com.WappProj.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import com.WappProj.dao.WappProjDaointerface;
import com.WappProj.dao.WhatsappDao;
import com.WappProj.entity.WhatsappUser;

public class WappProjController implements WappProjControllerinterface  {
    private BufferedReader b;
    private WappProjDaointerface wdao;
    public WappProjController() {
    	b = new BufferedReader(new InputStreamReader(System.in));
    	wdao = new WhatsappDao();
    }
	public void createProfileController() throws Exception {
     		
     		System.out.println("Enter Your Name:");
     		String name = b.readLine();
     		
     		System.out.println("Enter Your Email:");
     		String email = b.readLine();
     		
     		System.out.println("Enter Your Address:");
     		String address = b.readLine();
     		
     		System.out.println("Enter Your Password:");
     		String password = b.readLine();
     		
     		System.out.println("Profile in Process.........");
     		
     		WhatsappUser ws = new WhatsappUser();
     		ws.setName(name);
     		ws.setEmail(email);
     		ws.setAddress(address);
     		ws.setPassword(password);
           
     		int i = wdao.createProfile(ws);
     		
     		if(i>0)
     		{
     			System.out.println("Profile Created Successfully.........Thanks For Joining.");
     		}
     		else
     		{
     			System.out.println("Profile is not Created....");
     		}
	}

	public void editProfileController() throws Exception {
		System.out.println("Enter Your Email :");
		String aa1 = b.readLine(); 
		System.out.println("Enter Your Password :");
		String aa2 = b.readLine();
		WhatsappUser ws4 = new WhatsappUser();
		ws4.setEmail(aa1);
	    ws4.setPassword(aa2);
		WhatsappUser i=wdao.viewProfile(ws4);
		
		
		
		
		WhatsappUser ws5 = new WhatsappUser();
		ws5.setEmail(aa1);
        if(i!=null) {
        System.out.println("Enter Your New Name:");
		String aa3 = b.readLine();
		System.out.println("Enter Your New Address:");
		String aa5 = b.readLine();
		System.out.println("Enter Your New Password :");
		String aa6 = b.readLine();
       
        ws5.setName(aa3);
        ws5.setAddress(aa5);
        ws5.setPassword(aa6);
        int e = wdao.editProfile(ws5);
        if(e>0)
        {
        	System.out.println("Profile Edited Successfully...");
        }
        else
        {
        	System.out.println("Your Email or Password is Wrong. Please Try Again.");
        }
       }
       else {
    	   System.out.println("Profile not found.");
       }
	}

	public void viewProfileController() throws Exception {
		System.out.println("Enter email to view Profile");
		String ee = b.readLine();
		System.out.println("Enter Your Password To View Profile:");
		String aa2 = b.readLine();
		
		WhatsappUser ws1 = new WhatsappUser();
		ws1.setEmail(ee);
		ws1.setPassword(aa2);
		WhatsappUser ww = wdao.viewProfile(ws1);
		if(ww != null)
		{
			System.out.println("User Name is "+ww.getName());
			System.out.println("User Email is "+ww.getEmail());
			System.out.println("User Address is "+ww.getAddress());
			System.out.println("User Password is "+ww.getPassword());				
		}
		else
		{
			System.out.println("No Profile Belong To Given Mail. Create New Account. Thank You.");
		}
	}



	public void searchProfileController() throws Exception {
		  System.out.println("Enter Name TO Search Profile:");
		  String aa = b.readLine();
		  WhatsappUser ws2 =new WhatsappUser();
		  ws2.setName(aa);
		  WhatsappUser ww5 =  wdao.searchProfile(ws2);
		  if(ww5 != null)
		  {
			    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			    System.out.println("User Name is "+ww5.getName());
				System.out.println("User Email is "+ww5.getEmail());
				System.out.println("User Address is "+ww5.getAddress());
				System.out.println("User Password is "+ww5.getPassword());	
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		  }
		  else
		  {
			  System.out.println("User Not Found.......");
		  }
		 
	}

	public void deleteProfileController() throws Exception{
		System.out.println("Enter Profile  Email To Delete Profile");
		String ss = b.readLine();
		//System.out.println("Enter Profile  Email To Delete Profile");
		//String dd = b.readLine();
		WhatsappUser ws3 = new WhatsappUser();
		ws3.setEmail(ss);
		int j = wdao.deleteProfileDao(ws3);
		if(j>0)
		{
			System.out.println("Profile Deleted Successfully...");
		}
		else
		{
			System.out.println("Profile Doesn't Found....");
		}
	}
	public void viewallProfileController() throws Exception {
		// TODO Auto-generated method stub
		List<WhatsappUser> ww2 = wdao.viewAllProfile1();
		for(WhatsappUser ww3:ww2) {
	    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("User Name is "+ww3.getName());
		System.out.println("User Email is "+ww3.getEmail());
		System.out.println("User Address is "+ww3.getAddress());
		System.out.println("User Password is "+ww3.getPassword());
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		}
		
	}
	public void logoutprofile() {
		System.out.println("Logout profile Successfully.....");
		
	}

}

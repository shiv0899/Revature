package com.WappProj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.WappProj.entity.WhatsappUser;

public class WhatsappDao implements WappProjDaointerface {

	public int createProfile(WhatsappUser ws) {
        int i =0;
        try {
        	Class.forName("com.mysql.jdbc.Driver");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosys","root","ADShivankar0099@");
        	PreparedStatement ps = con.prepareStatement("INSERT INTO whatsappuser VALUES(?,?,?,?)");
        	ps.setString(1,ws.getName());
        	ps.setString(2, ws.getEmail());
        	ps.setString(3, ws.getAddress());
        	ps.setString(4, ws.getPassword());
        	
        	i = ps.executeUpdate();
        	
        	
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        
		return i;
	}

	public WhatsappUser viewProfile(WhatsappUser ws1) {
		WhatsappUser ww1=null;
			try {
	        	Class.forName("com.mysql.jdbc.Driver");
	        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosys","root","ADShivankar0099@");
	        	PreparedStatement ps = con.prepareStatement("SElECT * FROM whatsappuser WHERE email=? AND password=?");
	        	ps.setString(1, ws1.getEmail());
	        	ps.setString(2, ws1.getPassword());
	        	
	        	
	        	ResultSet res = ps.executeQuery();
			    if(res.next())
			    {
			       System.out.println("User Found --->");
			       ww1 = new WhatsappUser();
			       ww1.setName(res.getString(1));
			       ww1.setEmail(res.getString(2));
			       ww1.setAddress(res.getString(3));
			       ww1.setPassword(res.getString(4));
			    }
			    
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		return ww1;
	}

	public List<WhatsappUser> viewAllProfile1() {
		List<WhatsappUser> ll = new ArrayList<WhatsappUser>();
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosys","root","ADShivankar0099@");
        	PreparedStatement ps = con.prepareStatement("SElECT * FROM whatsappuser");
        	
        	ResultSet res = ps.executeQuery();
        	while(res.next())
        	{
        		WhatsappUser ww4 =new WhatsappUser();
        		ww4.setName(res.getString(1));
        		ww4.setEmail(res.getString(2));
        		ww4.setAddress(res.getString(3));
        		ww4.setPassword(res.getString(4));
        		ll.add(ww4);
        	}
        	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ll;
	}

	public WhatsappUser searchProfile(WhatsappUser ws2) {
		WhatsappUser ww6=null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosys","root","ADShivankar0099@");
        	PreparedStatement ps = con.prepareStatement("SElECT * FROM whatsappuser WHERE name=?");
        	ps.setString(1, ws2.getName());
        	
        	
        	ResultSet res = ps.executeQuery();
        	if(res.next())
        	{
        		 System.out.println("User Found --->");
			       ww6 = new WhatsappUser();
			      ww6.setName(res.getString(1));
			      ww6.setEmail(res.getString(2));
			      ww6.setAddress(res.getString(3));
			      ww6.setPassword(res.getString(4));
        	}
        	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ww6;
	}

	public int deleteProfileDao(WhatsappUser ws3)   {
		int j=0;
		try {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosys","root","ADShivankar0099@");
    	PreparedStatement ps = con.prepareStatement("DELETE FROM whatsappuser WHERE email=? ");
    	ps.setString(1, ws3.getEmail());
    	//ps.setString(2, ws3.getName());
    	j = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return j;
	}

	public int editProfile(WhatsappUser ws5) {
		int e=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosys","root","ADShivankar0099@");
	    	PreparedStatement ps = con.prepareStatement("UPDATE whatsappuser SET name=?,address=?,password=?  WHERE email=?  ");
			
			ps.setString(1, ws5.getName());
			ps.setString(4, ws5.getEmail());
			ps.setString(2, ws5.getAddress());
			ps.setString(3, ws5.getPassword());
			
			e =ps.executeUpdate();
			
		}
		catch(Exception es)
		{
			es.printStackTrace();
		}
		return e;
	}

	

}

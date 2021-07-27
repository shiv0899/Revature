package com.fbook1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.fbook1.controller.FbookControlleInterface;
import com.fbook1.controller.FbookController;
import com.fbook1.utility.ControllerFactory;
import com.fbook1.controller.FbookControlleInterface;
import com.fbook1.controller.FbookController;
public class FbookView {

	


	    private  static BufferedReader br;
		public static void main(String args[]) throws IOException
		{{
			br =new BufferedReader(new InputStreamReader(System.in));
			System.out.println("xxxxxxxxxxxx-- MAIN MENU --xxxxxxxxxxx");
			System.out.println("Press 1 to Create Profile");
			System.out.println("Press 2 to Edit Profile");
			System.out.println("Press 3 to View Profile");
			System.out.println("Press 4 to Login Profile");
			System.out.println("Press 5 to Search Profile");
			System.out.println("Press 6 to Delete Profile");
			System.out.println("Press 7 to Logout Profile");
			
			FbookControlleInterface f = ControllerFactory.createObject("FbookController");
			boolean q=true;
			while(q) {
			System.out.println("Enter the your choice:");
			String d =br.readLine();
			int c = Integer.parseInt(d);
			switch(c)
			{
		
			case 1: f.createProfile();
				break;
			case 2: f.editProfile();
				break;
			case 3: f.viewProfile();
				break;
			case 4: f.loginProfile();
				break;
			case 5: f.searchProfile();
				break;
			case 6: f.deleteProfile();
				break;
				
			case 7: q=false; 
			        f.logoutprofile();
				break;
			default:System.out.println("Wrong Choice");
				
			}
			
		}		
			
		}

	}
		}



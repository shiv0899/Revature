package com.WappProj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.WappProj.controller.WappProjControllerinterface;
import com.WappProj.utility.ControllerFac;

public class WappProjView {
	private static BufferedReader br;

	public static void main(String[] args) throws Exception {
		br = new BufferedReader(new InputStreamReader(System.in));
		

		WappProjControllerinterface wa = ControllerFac.createObject();
		boolean q = true;
		while (q) {
			System.out.println("<---xxxxxxxxxxxx-- MAIN MENU --xxxxxxxxxxx--->");
			System.out.println("          Press 1 to Create Profile           ");
			System.out.println("          Press 2 to Edit Profile             ");
			System.out.println("          Press 3 to View Profile             ");
			System.out.println("          Press 4 to View All Profile         ");
			System.out.println("          Press 5 to Search Profile           ");
			System.out.println("          Press 6 to Delete Profile           ");
			System.out.println("          Press 7 to LogOut Profile           ");
			System.out.println("<---xxxxxxxxxxxx-- MAIN MENU --xxxxxxxxxxx--->");
			int c = Integer.parseInt(br.readLine());
			switch (c) {
			case 1:
				wa.createProfileController();
				break;
			case 2:
				wa.editProfileController();
				break;
			case 3:
				wa.viewProfileController();
				break;
			case 4:
				wa.viewallProfileController();
				break;
			case 5:
				wa.searchProfileController();
				break;
			case 6:
				wa.deleteProfileController();
				break;
			case 7:
				  q=false;
				  wa.logoutprofile();
				  break;
			default: System.out.println("Wrong Choice....");
			}
		}
	}

}

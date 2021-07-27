package com.fbook1.utility;

import com.fbook1.controller.FbookControlleInterface;
import com.fbook1.controller.FbookController;

public class ControllerFactory {
	private ControllerFactory(){}
	public static FbookControlleInterface createObject(String ss)
	{
		FbookControlleInterface f =null;
		if(ss.equals("FbookController"))
		{
			if(f==null)
			
			 f = new FbookController();
			}	
		
		return f;
	}
}

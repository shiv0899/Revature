package com.WappProj.utility;

import com.WappProj.controller.WappProjController;
import com.WappProj.controller.WappProjControllerinterface;

public class ControllerFac {

	public static WappProjControllerinterface createObject() {
		// TODO Auto-generated method stub
		return new WappProjController();
	}

}

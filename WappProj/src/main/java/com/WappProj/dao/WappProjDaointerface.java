package com.WappProj.dao;

import java.util.List;

import com.WappProj.entity.WhatsappUser;

public interface WappProjDaointerface {

	int createProfile(WhatsappUser ws);

	WhatsappUser viewProfile(WhatsappUser ws1);

	List<WhatsappUser> viewAllProfile1();

	WhatsappUser searchProfile(WhatsappUser ws2);

	int deleteProfileDao(WhatsappUser ws3) throws Exception;

	int editProfile(WhatsappUser ws5);

}

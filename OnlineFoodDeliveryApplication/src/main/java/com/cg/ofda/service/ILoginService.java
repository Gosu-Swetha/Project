package com.cg.ofda.service;

import com.cg.ofda.dto.LoginDto;

public interface ILoginService {

	//public void signIn(LoginDto login);
	public boolean signOut();
	LoginDto signIn(LoginDto login);
	public LoginDto viewLoginDetails(String loginId);
	
}


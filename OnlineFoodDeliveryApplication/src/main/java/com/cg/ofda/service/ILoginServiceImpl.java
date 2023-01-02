package com.cg.ofda.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ofda.repository.ILoginRepository;
import com.cg.ofda.dto.LoginDto;
import com.cg.ofda.exception.UserNotFoundException;



@Service

public class ILoginServiceImpl implements ILoginService {


   @Autowired
   ILoginRepository loginRepository;


/* @author : Satya 
 * @return : true 
 * @description : This method signin user  in the repository and returns true
 */
  
//  public  boolean signIn() {
//
//	return true;
//   }
   
  @Override
	public LoginDto signIn(LoginDto login1) {
	 
	  	String userid = login1.getUserid() ;
		String userName = login1.getUserName();
		String password = login1.getPassword();

		Optional<LoginDto> login = loginRepository.findById(userid);

		if (login.isEmpty() || !login.get().getPassword().equals(password)) {

			throw new UserNotFoundException("Bad Credentials");
		}
		return  login.get();
	}
  
  
  	public LoginDto viewLoginDetails(String loginId) {
  		
  		return loginRepository.findById(loginId).get();
  	}
  
//  @Override
//	public User login(User user) {
//		String userName = user.getEmail();
//		String password = user.getPassword();
//
//		Optional<User> optionalUser = userRepository.findByEmail(userName);
//
//		if (optionalUser.isEmpty() || !optionalUser.get().getPassword().equals(password)) {
//
//			throw new UserNotFoundException("Bad Credentials");
//		}
//
//		return optionalUser.get();
//	}

/* @author : Satya 
 * @return : true 
 * @description : This method signout user  in the repository and returns true
 */
  public boolean signOut() {
	  
	return true;

	 }
}
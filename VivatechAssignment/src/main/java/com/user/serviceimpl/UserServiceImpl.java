package com.user.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.repo.UserRepo;
import com.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	UserRepo uRepo;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		
		return uRepo.save(user);
	}

	@Override
	public User getUser(int userId) {
		// TODO Auto-generated method stub
		User user = null;
		try {
			user =  uRepo.findById(userId).orElseThrow(() -> new Exception());
			return user;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

	@Override
	public User deleteUser(int userId) {
		// TODO Auto-generated method stub
		User user = null;
		try {
			user =  uRepo.findById(userId).orElseThrow(() -> new Exception());
			return user;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		uRepo.deleteById(userId);
		return user;
	}

	
}

package com.kayimai.service.user.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kayimai.dao.user.mapper.UserMapper;
import com.kayimai.domain.user.User;
import com.kayimai.service.user.UserService;


@Service("userService")  
public class UserServiceImpl implements UserService {  
	
    @Resource  
    private UserMapper userDao;  
    
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);  
    }

	public User queryUserByName(String loginName) {
		// TODO Auto-generated method stub
		return null;
	}
}

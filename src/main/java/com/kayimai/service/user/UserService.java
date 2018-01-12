package com.kayimai.service.user;

import com.kayimai.domain.user.User;

public interface UserService {  
	
    public User getUserById(int userId);  
    
    public User queryUserByName(String loginName);
}

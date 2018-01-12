package kayimai;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.kayimai.domain.user.User;
import com.kayimai.service.user.UserService;

@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class TestMyBatis {

    private static Logger logger = Logger.getLogger(TestMyBatis.class);  
    
    @Resource  
    private UserService userService;
    
    @Test  
    public void test1() {  
    	
    	User user = userService.getUserById(1);
    	
    	System.out.println(user.getUserName());
    	
    }
    
    

}

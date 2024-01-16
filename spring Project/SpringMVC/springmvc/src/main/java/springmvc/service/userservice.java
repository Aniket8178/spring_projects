package springmvc.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import springmvc.model.user;
import springmvc.orm.dao.UserDao;

@Service
public class userservice {

	@Autowired
	private UserDao UserDao;
	
	public int createuser(user user)
	{
		return this.UserDao.save(user); 
	}
}

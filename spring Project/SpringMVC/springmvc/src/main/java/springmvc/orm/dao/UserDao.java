package springmvc.orm.dao;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springmvc.model.user;

@Repository
public class UserDao {
 
	 @Autowired
	 private HibernateTemplate hibernatetemplate;
	 @Transactional
	 public int save(user user)
	 {
		 int id = (Integer)this.hibernatetemplate.save(user);
		 return id;
	 }
}

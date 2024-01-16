package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       StudentDao st = context.getBean("studentDao" , StudentDao.class);
       Student st1 = new Student(22334 , "Anuradha" , "khargpura");
       st.insert(st1);
       
    }
}

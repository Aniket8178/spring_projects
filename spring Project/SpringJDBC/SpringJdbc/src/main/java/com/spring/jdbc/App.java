package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.remoting.soap.SoapFaultException;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext cotext = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        StudentDao studentdao = cotext.getBean("stduentdao" , StudentDao.class);
//        student st = new student();
//        st.setId(99);
//        st.setName("Sandy");
//        st.setCity("gurgaon");
//        
//        int result = studentdao.insert(st);
//         
//        System.out.println("number of rescord inserted :- " + result);
        
        
        //---data updation-------
//          student st = new student();
//          st.setName("saloni");
//          st.setId(99);
//          int result = studentdao.change(st);
//          System.out.println("data updated --> " + result);
          
          //--------data deletion------
//          student st = new student();
//          st.setId(99);
//          int result = studentdao.Delete(st);
//          System.out.println("data deletion --> " + result);
        
        
        //get single record using select query
//        student st = studentdao.getstudent(212);
//        System.out.println(st);
        
        // getting multiple record of students
       List<student> s =  studentdao.getAllStudents();
       for(student s1 : s)
       {
    	   System.out.println(s1);
       }
          
    }
}

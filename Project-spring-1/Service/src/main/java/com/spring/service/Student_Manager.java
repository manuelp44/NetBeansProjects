/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.service;

import com.spring.dao.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author manuel
 */
public class Student_Manager {
    
    @Autowired
    Student student;
    
    public void studentInfo(){
       
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getAddress().getStreet());
        System.out.println(student.getAddress().getZip());
        System.out.println(student.getAddress().getCity());
        System.out.println(student.getGrade().getSubject());
        System.out.println(student.getGrade().getLgrade());
    }
    
    public void display(){
        System.out.println("HI");
    }
    
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");
        Student_Manager studentManager = (Student_Manager)context.getBean("studentManager");
        studentManager.studentInfo();
    }
}

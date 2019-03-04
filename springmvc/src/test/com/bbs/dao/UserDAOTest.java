package com.bbs.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class UserDAOTest {
    @Autowired
    private UserDAO userDAO;

    @Test
    public void testFindUserByAccount(){
        System.out.println(userDAO.findUserByAccount("aaa"));
    }

}
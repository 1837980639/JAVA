package com.example.test;

import com.example.test.dao.UserDao;
import com.example.test.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;
@SpringBootTest
class TestApplicationTests {

	@Autowired
	private UserDao userDao;

	@Test
	void contextLoads() {
		List<User> list = userDao.selectList(null);
		list.forEach(System.out::println);
	}

}

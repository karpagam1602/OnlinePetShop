package com.pet;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pet.bean.User;
import com.pet.controller.PetController;
import com.pet.controller.UserController;

@TestMethodOrder(OrderAnnotation.class)
@SpringBootTest
class UserMyTest {

	@Autowired
	UserController usercontroller;

	@Autowired
	PetController petcontroller;

	List<User> list = new ArrayList<User>();
	List<Integer> list1 = new ArrayList<Integer>();
	List<User> list2 = new ArrayList<User>();


	// to get all details of Users
	@Test
	@Order(2)
	void getAllUsers() {

		list = usercontroller.getAllUsers();
		System.out.println(list);
		assertNotNull(list);
	}

	// to get all Id
	@Test
	@Order(3)
	void getUserIdList() {
		list1 = usercontroller.getUserbylist();

		System.out.println(list1);
		assertNotNull(list1);

	}

}

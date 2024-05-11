package com.pet;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pet.bean.Appointment;

import com.pet.controller.AppointmentController;
import com.pet.controller.PetController;
import com.pet.controller.UserController;

@SpringBootTest
class AppointmentMyTest {

	@Autowired
	AppointmentController appcontroller;

	@Autowired
	PetController petcontroller;

	@Autowired
	UserController usercontroller;

	List<Appointment> list = new ArrayList<Appointment>();
	List<Integer> list1 = new ArrayList<Integer>();

//	@Test
//	void doAppointmnetInsert() {
//		Appointment app = new Appointment();
//		Pet pet=new Pet();
//		User user=new User();
//		
//		app.setAppId(11);
//		app.setAppDate("3rd MARCH");
//		pet.setPetId(3);
//		user.setUserId(2);
//		app.setPet(pet);
//		app.setUser(user);
//	   
//		String insertmsg = "Inserted";
//		String result = appcontroller.newApp(app);
//		assertEquals(insertmsg, result);
//
//	}

//	// to get all details of Users
	@Test
	void getAllApps() {

		list = appcontroller.getAllApps();
		System.out.println(list);
		assertNotNull(list);
	}

	// to get all Id
	@Test
	void getAppIdList() {
		list1 = appcontroller.getAppbylist();

		System.out.println(list1);
		assertNotNull(list1);

	}

}

package com.zee.zee5app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.zee.zee5app.dto.User;
import com.zee.zee5app.exceptions.NoDataFoundException;
import com.zee.zee5app.exceptions.UnableToGenerateIdException;
import com.zee.zee5app.service.UserService;
import com.zee.zee5app.service.UserServiceImpl;
import com.zee.zee5app.utils.IdComparator;

public class UserMain {

	public static void main(String[] args) {
		UserService userService = UserServiceImpl.getUserServiceInstance();
		try {
//			userService.insertuser(new User("an005", "Anurag", "karn", LocalDate.of(2022, 07, 18), LocalDate.of(1997, 12, 21), true));
//			userService.insertuser(new User("ac002", "Anubh", "chadda", LocalDate.of(2022, 07, 18), LocalDate.of(1998, 12, 15), true));
			Optional<User> result = userService.getUserByUserId("Ak1");
			if(result.isPresent()) {
				User user = result.get();
				System.out.println(user);
			}else {
				System.out.println("no record found!!");
			}
			Optional<List<User>> all_res = userService.getAllUsers();
			System.out.println(all_res.get());
			try {
				System.out.println(userService.deleteUser("Ak1"));
			} catch (NoDataFoundException e1) {
				e1.printStackTrace();
			}
			Optional<User[]> res = userService.findByOrderByUserNameDsc();
			if(!res.isPresent()) {
				System.out.println("No record found for get All users !!!");
			}else {
				User[] users = res.get();
				
				// copying from users to List and then sort the User based on userId
				List<User> list = new ArrayList();
				for (User user : users) {
					list.add(user);
				}
				//--------------method-1--------------------
//			Collections.sort(list);     // using comparable interface
				
				//--------------method-2--------------------
//			Collections.sort(list, new IdComparator());  // using comparator interface
				
				//--------------method-3--------------------
//			Comparator<User> comparator = new Comparator<User>() {
//
//				@Override
//				public int compare(User obj1, User obj2) {
//					return obj1.getUserId().compareTo(obj2.getUserId());
//				}
//			};
//			
//			Collections.sort(list, comparator);
				
				
				//--------------method-4--------------------
//			Comparator<User> comparator2 = (e1,e2)-> {
//				return e1.getUserId().compareTo(e2.getUserId());
//			};
//			Collections.sort(list, comparator2);
				
				
				
//			list.forEach(e->System.out.println(e));
				//----------------------------------------------
				
				
			}
//		try {
//			String r = userService.deleteUser("an002");
//			System.out.println(r);
//		} catch (NoDataFoundException e) {
//			e.printStackTrace();
//		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package com.spring.vn.models;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	public static List<User> ls = new ArrayList<User>();
	
	public User findbyUsername(String username) {
		for (User user : ls) {
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}
	public int update(User user) {
		for (int i = 0; i < ls.size(); i++) {
			if (ls.get(i).getUsername().equals(user.getUsername())) {
				ls.set(i, user);
				return i;
			}
			
		}
		return -1;
	}
	//muc dich viet hai ham findby and update nay la de viet ham save
	public int save(User user) {
		if (findbyUsername(user.getUsername()) != null) {
			update(user);
		}else {
			ls.add(user);
		}
		return 1;
	}
	public int delete(String username) {
		User u = findbyUsername(username);
		if(u !=null) {
			ls.remove(u);
			return 1;
		}
		return 0;
	}
	public List<User> getAll(){
		return ls;
	}
}

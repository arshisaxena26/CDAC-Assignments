package utils.sample_data;

import java.util.HashMap;

import core.bookshop_users.BookShopUsers;
import custom_exception.BookShopCustomException;

public class UsersCollectionsUtils {

	// Sample data for Admin and 5 customers
	public static HashMap<String, BookShopUsers> populateUserSampleData() throws BookShopCustomException {

		// Creating HashMap to store Users
		HashMap<String, BookShopUsers> usersMap = new HashMap<>();

		// Admin
		usersMap.putIfAbsent("admin@gmail.com", new BookShopUsers("admin@gmail.com", "admin123"));

		// Guest
		usersMap.putIfAbsent("guest@gmail.com", new BookShopUsers("guest@gmail.com", "guest"));

		// Customers
		usersMap.putIfAbsent("arshi@gmail.com", new BookShopUsers("arshi@gmail.com", "password"));
		usersMap.putIfAbsent("akshat@gmail.com", new BookShopUsers("akshat@gmail.com", "password"));
		usersMap.putIfAbsent("mayank@gmail.com", new BookShopUsers("mayank@gmail.com", "password"));
		usersMap.putIfAbsent("racsha@gmail.com", new BookShopUsers("racsha@gmail.com", "password"));
		usersMap.putIfAbsent("shreyasi@gmail.com", new BookShopUsers("shreyasi@gmail.com", "password"));

		return usersMap;
	}
}

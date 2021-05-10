package hrmsjava.HRMS.business.abstracts;

import java.util.List;

import hrmsjava.HRMS.entities.concretes.User;

public interface UserService {
	List<User> getAll();
}

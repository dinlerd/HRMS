package hrmsjava.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrmsjava.HRMS.entities.concretes.User;

public interface UserDao extends JpaRepository<User,Integer>{

}

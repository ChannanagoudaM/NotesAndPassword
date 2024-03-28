package com.example.NotesAndPasswordManagementSystem;

import org.springframework.data.jpa.repository.JpaRepository;
public interface CrudManage extends JpaRepository<AccountHolder,Integer> {

	AccountHolder findByname(String name);
	
	
	AccountHolder findBypassword(String pass);
	
}

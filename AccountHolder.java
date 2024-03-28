package com.example.NotesAndPasswordManagementSystem;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AccountHolder {

	@Id
	private long id;
	private String name;
	private String password;
	private String notes;
	
	public AccountHolder()
	{
		super();
	}
	
	
	




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "AccountHolder [Name=" + name + ", id=" + id + ", password=" + password + ", notes=" + notes + "]";
	}
	
	
	
}

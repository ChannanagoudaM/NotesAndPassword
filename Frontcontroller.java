package com.example.NotesAndPasswordManagementSystem;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class Frontcontroller {

	@Autowired
	CrudManage manage;
	
	
	@RequestMapping("/")
	public String start()
	{
		return "CreateAccount.jsp";
	}
	
	
	@RequestMapping("create")
	public String add(AccountHolder holder)
	{
		manage.save(holder);
		return "CreateAccount.jsp";
	}
	
	
	@RequestMapping("delete")
	public String delete(@RequestParam("id")int id)
	{
		manage.deleteById(id);
		return "CreateAccount.jsp";
	}
	
	@RequestMapping("get")
	public String getByname(@RequestParam("name")String name)
	{
		AccountHolder hold=manage.findByname(name);
		System.out.println(hold);
		return "CreateAccount.jsp";
	}
	
	@RequestMapping("modify")
	public String modify(@RequestParam("password") String pass,Model model)
	{
		AccountHolder hold=manage.findBypassword(pass);
		model.addAttribute("hold", hold);
		return "modify.jsp";
	}
	
	@RequestMapping("modifyhere")
	public String modified(@ModelAttribute("hold")AccountHolder holder,@RequestParam("notes")String notes)
	{
		System.out.println(holder);
		return "CreateAccount.jsp";
	}
	
	
	@RequestMapping("all")
	@ResponseBody
	public List<AccountHolder> displayAll(Model model,AccountHolder hold)
	{
		List<AccountHolder>l=manage.findAll();
		return l;
	}
}

/**
 * 
 */
package com.apress.demo.web.controllers;

import com.apress.demo.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Siva
 *
 */
@Controller
@AllArgsConstructor
public class HomeController
{
	UserRepository userRepo;
	
	@RequestMapping("/")
	public String home(Model model)
	{
		model.addAttribute("users", userRepo.findAll());
		return "index";
	}
}

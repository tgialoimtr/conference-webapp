package conference.controller;

import java.util.Map;
import java.util.List;
import java.util.LinkedList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import conference.model.User;
import conference.repository.UserRepository;

@Controller
public class AdminController {

	
	@Autowired
	private UserRepository userrepo;
	
	@ModelAttribute("user")
	public User getUserObject() {
		return new User();
	}
	
	@RequestMapping(value = "/admin")
	public String newuser() {
		return "admin";
	}

	
}

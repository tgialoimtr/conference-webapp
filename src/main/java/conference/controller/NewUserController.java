package conference.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import conference.model.User;
import conference.repository.UserRepository;

@Controller
public class NewUserController {

	
	@Autowired
	private UserRepository userrepo;
	
	@ModelAttribute("user")
	public User getUserObject() {
		return new User();
	}
	
	@RequestMapping(value = "/newuser")
	public String newuser() {
		return "newuser";
	}
	
	@RequestMapping(value = "/user/add")
	public String addUser(@Valid User user, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			System.out.println("[ERROR] Member no valid: " + user.toString());
		} else {
			userrepo.save(user);
		}
		return "redirect:/admin-listuser";
	}
	
}

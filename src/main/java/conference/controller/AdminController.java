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

import conference.model.Submission;
import conference.model.User;
import conference.repository.SubmissionRepository;
import conference.repository.UserRepository;

@Controller
public class AdminController {

	
	@Autowired
	private UserRepository userrepo;
	
	@ModelAttribute("user")
	public User getUserObject() {
		return new User();
	}
	
	@Autowired
	private SubmissionRepository submissionrepo;

	@RequestMapping(value = "/admin")
	public String adminHome() {
		return "admin";
	}
	
	@RequestMapping(value = "/")
	public String home() {
		return "index";
	}
	
	@ModelAttribute("submission")
	public Submission getSubmissionObject() {
		return new Submission();
	}
	
	@RequestMapping(value = "/admin-listuser")
	public String listUser(Map<String, Object> model) {
		Iterable<User> userIter = userrepo.findAll();
//		Iterable<User> userIter
//	    while (userIter.hasNext()) {
//	        collection.add(iterator.next());
//	    }
		model.put("userList", userIter);
		return "admin-listuser";
	}

	@RequestMapping(value = "/admin-submission")
	public String listSubmissions(Map<String, Object> model) {
		Iterable<Submission> userIter = submissionrepo.findAll();
		model.put("submissionList", userIter);
		return "admin-submission";
	}
	
}

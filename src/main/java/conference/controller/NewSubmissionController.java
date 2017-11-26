package conference.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import conference.model.Submission;
import conference.repository.SubmissionRepository;

@Controller
public class NewSubmissionController {

	
	@Autowired
	private SubmissionRepository submissionrepo;
	
	@ModelAttribute("submission")
	public Submission getSubmissionObject() {
		return new Submission();
	}
	
	@RequestMapping(value = "/new-submission")
	public String newSubmission() {
		return "new-submission";
	}
	
	@RequestMapping(value = "/submission/add")
	public String addSubmission(@Valid Submission submission, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			System.out.println("[ERROR] Submission no valid: " + submission.toString());
		} else {
			System.out.println("Saved submission");
			submissionrepo.save(submission);
		}
		return "redirect:/admin-submission";
	}
	
}

package conference.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SponsorController {

	@RequestMapping(value = "/sponsor")
	public String sponsor() {
		return "sponsor";
	}	
	@RequestMapping(value = "/sponsor/add")
	public String addsponsor() {
		return "addsponsor";
	}

}

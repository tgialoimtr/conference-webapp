package conference.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import webapp.service.CalcService;
import org.springframework.boot.actuate.endpoint.MetricsEndpoint;


@Controller
public class OcrStatusController {

    private MetricsEndpoint metricsEndpoint;

    @Autowired
    private void setMetricsEndpoint(MetricsEndpoint metricsEndpoint) {
        this.metricsEndpoint = metricsEndpoint;
    }
    
	@RequestMapping("/ocr/status")
    @ResponseBody
	public String hihi() {
		return "simple json";
	}
	
	@RequestMapping("/a")
	public ModelAndView test0() {
		System.out.println("Test");
		return new ModelAndView("welcome");
	}
	
	@RequestMapping("/b")
	public String welcome(Map<String, Object> model) {
		model.put("message", "HIHIHIIIIIII");
		return "welcome";
	}
}

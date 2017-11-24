package webapp.service;

import org.springframework.stereotype.Component;

@Component
public class CalcService {

	private int state = 0;
	
	
	public String calc(long param) {
		state++;
		return "{" + state + " " + param;
	}
}

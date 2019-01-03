package gate.gate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gate")
public class Gate {

	@RequestMapping("type")
	public String getString(String type){
		return type + "test";
	}
	
	@RequestMapping("too")
	public String getToo(String type){
		return type + "too";
	}

}

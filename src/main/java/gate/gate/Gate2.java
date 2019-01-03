package gate.gate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("too")
public class Gate2 {

	@RequestMapping("type")
	public String getString(String type){
		return type + "test";
	}
	
	@RequestMapping("too")
	public String getToo(String type){
		return type + "too";
	}

}

package cn.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CsController {

	@GetMapping("cs")
	public String cs(){
		return "okle";
	}
}

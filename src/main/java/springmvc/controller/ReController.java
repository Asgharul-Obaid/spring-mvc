package springmvc.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	  @RequestMapping("/one") 
	  public RedirectView One() {
	  System.out.println("this is one handler");
	  RedirectView redirectView = new RedirectView();
	  redirectView.setUrl("enjoy");
	  return redirectView; 
	  }
	 
	@RequestMapping("/enjoy")
	public String Two() {
		System.out.println("this is second handler [enjoy]");
		return "";
	}
}

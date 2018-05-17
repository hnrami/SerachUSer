package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
    	System.out.println(greeting.getContent());
    	String result="result";
    	if(greeting.getContent().equalsIgnoreCase("Sneha")) {
    		greeting.setContent(greeting.getContent()  + " is valide user" );
    		
    	}else {
    		greeting.setContent(greeting.getContent() + " not valide user");
    		result="result2";
    	}
    		
    	return result;
    }

}

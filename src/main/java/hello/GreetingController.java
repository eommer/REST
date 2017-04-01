package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class GreetingController {

    private int stock = 0;
    private String returnMsg = "";
   
	@RequestMapping(method = RequestMethod.GET, value = "/{name}")
	public String productGet(@PathVariable String name) {
		
		if(name.equals("carotte")){
    		stock = 12;    		
    	}
    	else{
    		stock = 0;
    	}	
		returnMsg = name + " | Stock : " + stock ;
		
		return returnMsg;
	}
}

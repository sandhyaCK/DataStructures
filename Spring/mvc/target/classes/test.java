import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class test {
	@ResponseBody
	@RequestMapping("/sandy")
	   
	       public String displayName() {
	    	   return "this is Sandhya";
	       }
}

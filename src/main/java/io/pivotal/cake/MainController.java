package io.pivotal.cake;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping("/")
	@ResponseBody
	public void index(HttpServletResponse response) throws IOException {
		new index().render(response.getWriter(), Arrays.asList("pie", "cake", "ice cream"));
	}

}

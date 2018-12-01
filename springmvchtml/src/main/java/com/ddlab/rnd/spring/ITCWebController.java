package com.ddlab.rnd.spring;

import java.security.Principal;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ITCWebController {
	
	@RequestMapping("/")
    public String handleIndexPage(Model model, Locale locale) {
//        return "loginPage.html";
		return "index.html";
    }
	
	@RequestMapping(value = "/loginPage", method = RequestMethod.GET)
    public String loginPage() {
        return "static/loginPage.html";
    }
	
	@RequestMapping(value = "/failed", method = RequestMethod.GET)
    public String failedPage() {
        return "static/failed.html";
    }
	
//	@RequestMapping("/static/secured/basicWebsockets")
	@RequestMapping("/secured/basicWebsockets")
    public String basicWebsocketsPage(Model model, Principal principal,
            Locale locale) {

        // Get the logged in user's name
        String userName = principal.getName();


        return "/static/secured/Socket.html";
    }

}

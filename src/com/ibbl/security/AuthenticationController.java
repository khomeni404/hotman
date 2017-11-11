package com.ibbl.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Khomeni
 *         Created on : 17-May-17 at 12:05 AM
 */

@Controller
@RequestMapping("/auth/")
public class AuthenticationController {
    @RequestMapping(method = RequestMethod.POST, value = "/authenticateUser.ibbl")
    public ModelAndView authenticateUser(@RequestParam("username") String username,
                                         @RequestParam("password") String password) throws Exception {
        boolean isAuthenticated = true;// authService.authenticate(username, password);
        if (isAuthenticated) {
            return new ModelAndView("redirect:/home/dashboard.ibbl");
        } else {
            return new ModelAndView("redirect:/");
        }
    }
}

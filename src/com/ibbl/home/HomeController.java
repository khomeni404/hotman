package com.ibbl.home;

import com.ibbl.util.Utility;
import org.apache.commons.validator.GenericValidator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Khomeni
 * Created on : 16-May-17
 */

@Controller
@RequestMapping(value = "/home/", method = {RequestMethod.GET, RequestMethod.HEAD})
public class HomeController {

    @RequestMapping(value = "/login.ibbl", method = RequestMethod.HEAD)
    public ModelAndView login() {
        return new ModelAndView("/home/login");
    }

    @RequestMapping(value = "/dashboard.ibbl")
    public ModelAndView dashboard(@RequestParam(required = false) String message) {
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("PageTitle", "Home");
        modelMap.put("TU", new Utility());
        modelMap.put("message", GenericValidator.isBlankOrNull(message) ? "Welcome  Home !" : message);
        return new ModelAndView("home/dashboard", modelMap);

    }
}

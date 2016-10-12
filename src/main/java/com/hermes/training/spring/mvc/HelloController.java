package com.hermes.training.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
In Spring MVC, a controller is a class that is ultimately responsible for handling a
request and performing some processing on it. It is configured as just another JavaBean
in the Spring application context. This means you can take full advantage of dependency
injection and Spring AOP with a controller class just as you would any other bean.
In the case of HomeController, dependency injection is used to configure the greeting that
will be displayed on the homepage. In a more complex controller, you might wire service layer beans
into the controller so that the controller can delegate responsibility for business
logic to a service-layer bean.
*/

@Controller
public class HelloController {

    private static final String DYNAMIC_MESSAGE = "This redirection is proof that your DispatcherServlet " +
            "successfully found yor controller and your view as well as the data needed to fill it!";

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView helloWorld() {
        return new ModelAndView("hello", "message", DYNAMIC_MESSAGE);
    }
}

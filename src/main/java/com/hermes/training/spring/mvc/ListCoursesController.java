package com.hermes.training.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListCoursesController {

    private String courseService;

    @RequestMapping(value = "/listCourses", method = RequestMethod.GET)
    public ModelAndView helloWorld() {
        return new ModelAndView("listCourses", "message", courseService);
    }

    public void setCourseService(String courseService) {
        this.courseService = courseService;
    }
}

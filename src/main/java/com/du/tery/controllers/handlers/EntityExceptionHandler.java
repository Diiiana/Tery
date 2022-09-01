package com.du.tery.controllers.handlers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class EntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ModelAndView serverError(Exception exception) {
        ModelAndView errorPage = new ModelAndView();
        errorPage.setViewName("error-page");
        errorPage.addObject("message", exception.getMessage());
        return errorPage;
    }
}

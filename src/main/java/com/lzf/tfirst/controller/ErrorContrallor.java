package com.lzf.tfirst.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class ErrorContrallor implements ErrorController {
    private static final String ERROR_PATH = "/error";

    @RequestMapping(value = ERROR_PATH)
    public String error(HttpServletRequest request){
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if (status != null) {
            Integer statusCode = Integer.valueOf(status.toString());

            if (statusCode == HttpStatus.NOT_FOUND.value()) {
                return "forward:/404";
            } else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                String s = request.getAttribute(RequestDispatcher.ERROR_EXCEPTION).toString();
                if (s.contains("permission")){
                    return "redirect:/noPermisson";
                }

                return "redirect:/500";
            }
        }
        return "redirect:/mError";
    }

    @RequestMapping("/mError")
    public String error(Model model){
        return "redirect:/error.html";
    }
    @RequestMapping("/500")
    public String errors(Model model){
        return "/500.html";
    }
    @RequestMapping("/404")
    public String si(Model model){
        return "/404.html";
    }

    @RequestMapping("/noPermisson")
    public String noPermisson(Model model){
        return "/noPermisson.html";
    }


    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}

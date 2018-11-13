package com.teams.controller;

import com.teams.model.TeamType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by pshynin on Nov, 2018
 */
@RestController
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity<String> createTeamsView(@RequestBody TeamType teamType) {
        return new ResponseEntity<String>("{}", HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    TeamType createOrder(Model model) {
        return new TeamType();
    }

    @RequestMapping(value="/banner", method = RequestMethod.GET)
    public String banner(Model model, HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        model.addAttribute("username", session.getAttribute("username"));

        return "banner";
    }

}
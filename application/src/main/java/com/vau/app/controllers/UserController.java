package com.vau.app.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController() @RequestMapping(value="/user") public class UserController {	@GetMapping(produces="MediaType.APPLICATION_JSON_VALUE", value="/info") @ResponseBody() public String getUserInfo() { 
return "hello world";
}}
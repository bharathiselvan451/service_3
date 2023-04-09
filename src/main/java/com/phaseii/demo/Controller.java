package com.phaseii.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	RestRepo_2 source;

	@GetMapping("/find/{mail}")
	@ResponseBody
	public <Optional>List<Service_2_model> method(@PathVariable("mail") String mail) {
		System.out.println("here");
        List<Service_2_model> list = (source.findByMail(mail));
        return list;
	}
	
}

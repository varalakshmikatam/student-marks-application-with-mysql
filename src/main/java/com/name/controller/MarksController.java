package com.name.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.name.model.Marks;
import com.name.service.MarksService;

@RestController
public class MarksController {
@Autowired
private MarksService service;
@PostMapping("/save")
public Marks save(@RequestBody Marks m,Model model)
{
	Marks m1=service.saveMarks(m);
	return m1;
}
}

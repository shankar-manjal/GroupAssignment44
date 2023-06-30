package com.example.groupass.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.groupass.model.Group;
import com.example.groupass.service.GroupService;

@RestController
public class GroupController {

	@Autowired
	GroupService groupService;
	
	@PostMapping("/saveDetailsOfGroup")
	public Group saveGroupDetails(@RequestBody Group group)
	{
		return groupService.saveGroupDetails(group);
	}
	@GetMapping("/listOfGroupDetails")
	public List<Group> getByGroupDetails()
	{
		return groupService.getByGroupDetails();
	}
	@PutMapping("/UpdateDetails/{id}")
	public Group getByUpdateDetails(@RequestBody Group group,@PathVariable("id")long id)
	{
		return groupService.getByUpdateDetails(group,id);
	}
	@DeleteMapping("/deleteRecords/{id}")
	public void getByDeleteDetails(@PathVariable("id")long id)
	{
		groupService.getByDeleteDetails(id);
	}
}

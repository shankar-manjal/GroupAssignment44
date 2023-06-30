package com.example.groupass.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.groupass.dao.GroupRepository;
import com.example.groupass.model.Group;

@Service
public class GroupService {
	@Autowired
	GroupRepository groupRepository;

	public Group saveGroupDetails(Group group) {
		
		return groupRepository.save(group);
	}

	public List<Group> getByGroupDetails() {
		
		return groupRepository.findAll();
	}

	public Group getByUpdateDetails(Group newEntity, long id) {
		
		Group oldEntity=groupRepository.findById(id).get();
		if(newEntity.getGroupName()!=null)
		{
			oldEntity.setGroupName(newEntity.getGroupName());
		}
		if(newEntity.getGroupDescription()!=null)
		{
			oldEntity.setGroupDescription(newEntity.getGroupDescription());
		}
		if(newEntity.getGroupRole()!=null)
		{
			oldEntity.setGroupRole(newEntity.getGroupRole());
		}
		if(newEntity.getIndustry()!=null)
		{
			oldEntity.setIndustry(newEntity.getIndustry());
		}
		if(newEntity.getLocation()!=null)
		{
			oldEntity.setLocation(newEntity.getLocation());
		}
		groupRepository.save(oldEntity);
		return oldEntity;
	}

	public void getByDeleteDetails(long id) {
		Group oldEntity=groupRepository.findById(id).get();		
		if(oldEntity!=null)
		{
			groupRepository.delete(oldEntity);
		}
	}

}

package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.module.Student;
import com.example.demo.module.Studentidgenerate;
import com.example.demo.repo.Stdidgenerate;
import com.example.demo.repo.StudentRepo;
import com.example.demo.service.StudentService;
@Service
public class StudetServiceImpl implements StudentService {
    @Autowired
	Stdidgenerate gid;
  @Autowired
    StudentRepo repo;
  
	@Override
	public Student addstudent(Student s) {
		Studentidgenerate sid=new Studentidgenerate();
		gid.save(sid);
		s.setId("Kpsc00"+gid.getsid());
		return repo.save(s);
	}

	@Override
	public List<Student> getallstudents() {
		
		return repo.findAll();
	}

	@Override
	public Student getbyid(String id) {
		
		return repo.findById(id).orElseThrow(()-> new ResourceNotFoundException());
	}

}

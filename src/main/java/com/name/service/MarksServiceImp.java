package com.name.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.name.model.Marks;
import com.name.repo.MarksRepo;
@Service
public class MarksServiceImp implements MarksService {

	@Autowired
	private MarksRepo repo;
	@Override
	public Marks saveMarks(Marks m) {
		// TODO Auto-generated method stub
		
	     int total=(m.getS1()	+m.getS2()+m.getS3());
	     m.setTotal(total);
	     double avg=total/3;
	     m.setPer(avg);
	     if(avg>70)
	     {
	    	 m.setGrade("A");
	    	 System.out.println("A");
	    	
	     }
	     else{
	    	 m.setGrade("B");
	     }
	     
		
		
		
	Marks m1=repo.save(m);
		return m1;
	}

}

package com.xworkz.apolla.patients;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
  public class Patient {
		
		private String patientName;
	    private String address;
	    private Gender gender;
	    private Integer age;
	
	    
	    public Patient()
	    {
	    super();
	    this.patientName=patientName;
	    this.address=address;
	    this.gender=gender;
	    this.age=age;
	    }
	    
	    
	    public void display()
	    {
	    	System.out.println("patient name is" + this.getPatientName());
	    	System.out.println("patient address is" + this.getAddress());
	    	System.out.println("patient gender is" + this.getGender());
	    	System.out.println("patient age is" + this.getAge());
	    }


		 
		}
	    	
	    
	    
	    

	



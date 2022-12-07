package com.xworkz.srms.manager;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Managers {
			
			private String managerName;
		    private String address;
		    private Gender gender;
		    private Integer age;
		
		    
		    public  Managers()
		    {
		    super();
		    this.managerName=managerName;
		    this.address=address;
		    this.gender=gender;
		    this.age=age;
		    }
		    
		    
		    public void display()
		    {
		    	System.out.println("patient name is" + this.getManagerName());
		    	System.out.println("patient address is" + this.getAddress());
		    	System.out.println("patient gender is" + this.getGender());
		    	System.out.println("patient age is" + this.getAge());
		    }


			 
			}
		    	
	

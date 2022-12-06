package com.xworkz.apolla.patients;
	
public class ApollaHospetals extends Hospital {
		
		public Patient[] patients;
		public int index;
		
		public ApollaHospetals(int size)
		{
			patients=new Patient[size];
		}
		
		
		public boolean addPatient(Patient patient)
		{
			System.out.println("inside add patients method");
			boolean isPatientAdded=false;
			if(patient!=null)
			{
				System.out.println("patient deatails is added");
				patients[index++]=patient;
				isPatientAdded=true;
			}
			return isPatientAdded;
			
		}
		
		public void getAllPatients()
		{
			System.out.println("list of patients");
			for(int i=0; i<patients.length; i++)
			{
				System.out.println(patients[i].getAddress()+ " " + patients[i].getPatientName()+
						patients[i].getGender()+ " " + patients[i].getAge());
				
			}
				
		}
		
		
		//i need 1 patient information 
		public void getPatientByName(String patientName)
		{
			System.out.println("inside get Patient name");
			System.out.println("no of parameter : 1 : patientName(String)");
			
			for(int i=0; i<patients.length; i++)
			{
				
				if(patients[i].getPatientName().equals(patientName))
				{
					
				  System.out.println(patients[i].getAddress()+ " " + patients[i].getPatientName()+
						patients[i].getGender()+ " " + patients[i].getAge());
			
				}
	        }
		}
		
		
		public void getPatientByAge(int age)
		{
			System.out.println("inside get Patient age");
			System.out.println("no of parameter : 1 : patientAge(int)");
			
			for(int i=0; i<patients.length; i++)
			{
				
				if(patients[i].getAge().equals(age))
				{
					
				  System.out.println(patients[i].getAddress()+ " " + patients[i].getPatientName()+
						patients[i].getGender()+ " " + patients[i].getAge());
			
				}
	        }
		}
		
		
		public void getPatientByAddress(String address)
		{
			System.out.println("inside get Patient address");
			System.out.println("no of parameter : 1 : address(String)");
			
			for(int i=0; i<patients.length; i++)
			{
				
				if(patients[i].getAddress().equals(address))
				{
					
				  System.out.println(patients[i].getAddress()+ " " + patients[i].getPatientName()+
						patients[i].getGender()+ " " + patients[i].getAge());
			
				}
	        }
		}
		
		
		public void getPatientByGender(Gender gender)
		{
			System.out.println("inside get Patient gender");
			System.out.println("no of parameter : 1 : Gender(String)");
			
			for(int i=0; i<patients.length; i++)
			{
				
				if(patients[i].getGender().equals(gender))
				{
					
				  System.out.println(patients[i].getAddress()+ " " + patients[i].getPatientName()+
						patients[i].getGender()+ " " + patients[i].getAge());
			
				}
	        }
		}



}

		
			


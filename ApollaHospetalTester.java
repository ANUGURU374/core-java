package com.xworkz.apolla;
import java.util.Scanner;
import com.xworkz.apolla.patients.ApollaHospetals;
import com.xworkz.apolla.patients.Gender;
import com.xworkz.apolla.patients.Patient;

public class ApollaHospetalTester {
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size");
			int size=sc.nextInt();
			
			ApollaHospetals ap=new  ApollaHospetals(size);
			
			 for(int i=0; i<size; i++)
			{	
			
			  Patient patient=new Patient();
			  System.out.println("enter the patients name");
			  patient.setPatientName(sc.next());
			  System.out.println("enter the patients age");
			  patient.setAge(sc.nextInt());
			  System.out.println("enter the patients gender");
			  String gender1=sc.next();
			  patient.setGender(Gender.valueOf(gender1));
			  System.out.println("enter the patients address");
			  patient.setAddress(sc.next()); 
			  ap.addPatient(patient);
			  
			}
			ap.getAllPatients();
			
			//System.out.println("enter the patient name");
			//String patientName=sc.next();
			//ap.getPatientByName(patientName);
			
			//System.out.println("enter the patient age");
			//int age=sc.nextInt();
			//ap.getPatientByAge(age);
			
			//System.out.println("enter the patient address");
			//String address=sc.next();
			//ap.getPatientByAddress(address);
			
			//System.out.println("enter the patient gender");
			//String gender=sc.next();
			//ap.getPatientByGender(Gender.valueOf(gender));
			
			
			//uptade opeartion
			
//			System.out.println("enter the patient name");
//			String patients=sc.next();
//			
//			System.out.println("enter the patient new address");
//			String paddress=sc.next();
//			
//			ap.updatePatientAddressByName(patients,paddress);
//			ap.getAllPatients();
			
			
//			System.out.println("enter the patient name");
//			String pat=sc.next();
//			System.out.println("enter the patient new age");
//			int pAge=sc.nextInt();
//			
//			ap.updatePatientAgeByName(pAge,pat);
//			ap.getAllPatients();
//			ap.getAllNewPatients();
//			s
			
			System.out.println("enter the patient name");
			String name=sc.next();
			ap.deletePatientByname(name);
			ap.getAllNewPatients();
			
			
			
				
		}	

}


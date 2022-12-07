package com.xworkz.srms;

import java.util.Scanner;

import com.xworkz.srms.manager.Gender;
import com.xworkz.srms.manager.Managers;
import com.xworkz.srms.showroom.ShowRoom;

public class ShowRoomTester {

			public static void main(String args[])
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the size");
				int size=sc.nextInt();
				
				ShowRoom ap=new  ShowRoom(size);
				
				 for(int i=0; i<size; i++)
				{	
				    Managers m=new Managers();
				    
				  System.out.println("enter the manager name");
				  m.setManagerName(sc.next());
				  System.out.println("enter the manager age");
				  m.setAge(sc.nextInt());
				  System.out.println("enter the manager gender");
				  String gender1=sc.next();
				  m.setGender(Gender.valueOf(gender1));
				  System.out.println("enter the manager address");
				  m.setAddress(sc.next()); 
				  ap.addManagers(m);
				  
				}
				ap.getAllManagers();
				
//				System.out.println("enter the manager name");
//				String patientName=sc.next();
//				ap.getManagerByName(patientName);
//				
//				System.out.println("enter the manager age");
//				int age=sc.nextInt();
//				ap.getManagerByAge(age);
//				
//				System.out.println("enter the manager address");
//				String address=sc.next();
//				ap.getManagerByAddress(address);
//				
//				System.out.println("enter the manager gender");
//				String gender=sc.next();
//				ap.getManagerByGender(Gender.valueOf(gender));
//				
				
				//uptade opeartion
//				
				System.out.println("enter the manager name");
				String manager=sc.next();
				System.out.println("enter the manager new address");
				String paddress=sc.next();
				
				ap.updateManagerAddressByName(manager,paddress);
				ap.getAllManagers();
//				
//				
//				System.out.println("enter the manager name");
//				String pat=sc.next();
//				System.out.println("enter the patient new age");
//			    int pAge=sc.nextInt();
//				
//				ap.updateManagergeByName(pAge,pat);
//				ap.getAllManagers();
//				ap.getAllNewManagers();
			
				
//				System.out.println("enter the  delting manager name");
//				String name=sc.next();
//				ap.deleteManagerByname(name);
//				ap.getAllNewManagers();
				
				
				
					
			}	

	}





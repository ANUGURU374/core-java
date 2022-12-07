package com.xworkz.srms.showroom;

import com.xworkz.srms.manager.Gender;
import com.xworkz.srms.manager.Managers;

public class ShowRoom extends Managers{
	
	public Managers[] managers;
	public int index;
	private Managers[] newManagers;
	
	
	public ShowRoom(int size)
	{
		managers=new Managers[size];
	}
	
	
	public boolean addManagers(Managers manager)
	{
		System.out.println("inside add manager method");
		boolean isManagersAdded=false;
		if(managers!=null)
		{
			System.out.println("patient deatails is added");
			managers[index++]=manager;
			isManagersAdded=true;
		}
		return isManagersAdded;
		
	}
	
	public void getAllManagers()
	{
		System.out.println("list of patients");
		for(int i=0; i<managers.length; i++)
		{
			System.out.println(managers[i].getAddress()+ " " + managers[i].getManagerName()+
					managers[i].getGender()+ " " + managers[i].getAge());
			
		}
			
	}
	
	
	//i need 1 manager information 
	public void getManagerByName(String managerName)
	{
		System.out.println("inside get manager name");
		System.out.println("no of parameter : 1 : managerName(String)");
		
		for(int i=0; i<managers.length; i++)
		{
			
			if(managers[i].getManagerName().equals(managerName))
			{
				
			  System.out.println(managers[i].getAddress()+ " " + managers[i].getManagerName()+
					  managers[i].getGender()+ " " + managers[i].getAge());
		
			}
        }
	}
	
	
	public void getManagerByAge(int age)
	{
		System.out.println("inside get manager age");
		System.out.println("no of parameter : 1 : managerAge(int)");
		
		for(int i=0; i<managers.length; i++)
		{
			
			if(managers[i].getAge().equals(age))
			{
				
			  System.out.println(managers[i].getAddress()+ " " + managers[i].getManagerName()+
					  managers[i].getGender()+ " " + managers[i].getAge());
		
			}
        }
	}
	
	
	public void getManagerByAddress(String address)
	{
		System.out.println("inside get manager address");
		System.out.println("no of parameter : 1 : address(String)");
		
		for(int i=0; i<managers.length; i++)
		{
			
			if(managers[i].getAddress().equals(address))
			{
				
			  System.out.println(managers[i].getAddress()+ " " + managers[i].getManagerName()+
					  managers[i].getGender()+ " " + managers[i].getAge());
		
			}
        }
	}
	
	
	public void getManagerByGender(Gender gender)
	{
		System.out.println("inside get manager gender");
		System.out.println("no of parameter : 1 : Gender(String)");
		
		for(int i=0; i<managers.length; i++)
		{
			
			if(managers[i].getGender().equals(gender))
			{
				
			  System.out.println(managers[i].getAddress()+ " " + managers[i].getManagerName()+
					  managers[i].getGender()+ " " + managers[i].getAge());
		
			}
        }
	}
	
	public boolean updateManagerAddressByName(String name,String newManagerAddress)
	{
		boolean isUpdated=false;
		System.out.println("inside update manager AddressByName");
		System.out.println("no of parameter : 2 : 1) param mangerName(String) 2) param managerName");
		for(int i=0; i<managers.length; i++)
		{
			if(managers[i].getManagerName().equals(name))
			{
				System.out.println("manager name is mached.... proceed with update ");
				managers[i].setAddress(newManagerAddress);
				isUpdated=true;
				
				
				
			}
		}
		return isUpdated;
	}
	
	public boolean updateManagergeByName(int newAge,String name)
	{
		boolean isUpdated=false;
		System.out.println("update manager age by name");
		System.out.println("no of parameter : 2 : 1) param age(String) 2) param manager Name");
		for(int i=0; i<managers.length; i++)
			
		{
			if(managers[i].getManagerName().equals(name))
			{
				System.out.println("manager name is mached.... proceed with update ");
				managers[i].setAge(newAge);
				isUpdated=true;
				
			}
		}
		return isUpdated;
	}
	
	
	public boolean deleteManagerByname(String managerName)
	{
		boolean isDeleted=false;
		newManagers= new Managers[managers.length-1];
		for(int i=0,k=0;i<managers.length;i++)
		{
			if(!managers[i].getManagerName().equals(managerName))
			{
				newManagers[k++]=managers[i];
				isDeleted=true;
				
			}
		}
		return isDeleted;
    }
		
		public void getAllNewManagers()
		{
			System.out.println("list of managers are");
			for(int i=0; i<newManagers.length; i++)
			{
				System.out.println(newManagers[i].getAddress()+ " " + newManagers[i].getManagerName()+" "
			        +newManagers[i].getGender()+ " " + newManagers[i].getAge());
				
				
			}
			
		}
}

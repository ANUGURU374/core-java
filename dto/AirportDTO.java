package com.xworkz.collections.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class AirportDTO 

{
	
	private String  airportName;
    private String  source;
    private String destination;

	
    public  AirportDTO(String  airportName, String  source,String destination) 
    {
       this.airportName=airportName;
       this.source=source;
       this.destination=destination;

	}

    
	@Override
    public boolean equals(Object obj) 
	{

		if(obj!=null) 
		{

			if(obj instanceof AirportTester) 
			{

				AirportDTO  air=(AirportDTO)obj;
                if(air.getAirportName().equals(this.airportName)) 
                {
                	System.out.println("name is maching"+ air.airportName);
                     return true;

			     }

			}

		}

		return false;

		

	}

}


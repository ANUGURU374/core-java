class AirportInIndia
{
  static String airportNames[]={null,null,null,null,null};
  static int index;

    public static boolean  addAirportNames(String airportName) 
   {
    System.out.println("inside addAirportNames");
	
	
	
	if(airportNames.length<=5)
	{
	     airportNames[index]=airportNames;
	     index++;
	}
    else
	{
		System.out.println("out");
	}
	
	
	
	System.out.println("end addAirportNames");
	return true;
   }
  
   
   public  static void getAirportNames()
   {
     for(int index=0; index<airportNames.length; index++)
	 {
	    String ref=airportNames[index];
		System.out.println(ref);
	 
	 }
   }
}
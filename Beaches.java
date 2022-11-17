class Beaches
{
  static String beachNames[]={null,null,null,null,null};
  static int index;

    public static boolean  addBeachNames(String beachName) 
   {
    System.out.println("inside addBeachNames");
	
	
	
	if(beachNames.length<=5)
	{
	     beachNames[index]=beachName;
	     index++;
	}
    else
	{
		System.out.println("out");
	}
	
	
	
	System.out.println("end addBeachNames");
	return true;
   }
  
   
   public  static void getBeachNames()
   {
     for(int index=0; index<beachNames.length; index++)
	 {
	    String ref=beachNames[index];
		System.out.println(ref);
	 
	 }
   }
}
class SoapTester
{
   public static void main(String a[])
   {
      Soap sp=new Soap();
	  sp.name="FB";      
	  sp.shape="sqr";
      sp.color="red";
      sp.price=34;
	  sp.toGetFresh();
	  System.out.println(sp.name + " " + sp.color + " " +sp.price + "" +sp.shape);
	  
	  
	  Soap sp1=new Soap();
	  sp1.name="FB";      
	  sp1.shape="sqr";
      sp1.color="red";
      sp1.price=34;
	  sp1.toGetFresh();
	  System.out.println(sp1.name + " " + sp1.color + " " +sp1.price + "" +sp1.shape);
   
   }

}
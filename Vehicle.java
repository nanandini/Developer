class Vehicle
{
	
	     static double Transport(String source, String destination)
		 {
	//*		 
			 System.out.println("Transport which includes source and destination");

			 if(source=="Chikkaballapur" && destination=="Banglore")
			 {
				  System.out.println("source="+source+ "destination="+destination);
				  return 12.46;
			 }
			 
			 if(source=="Banglore" && destination=="Kolar")
			 {
				  System.out.println("source="+source+ "destination="+destination);
				  return 20.60;		 
			 }
			 
			 if(source=="Kolar" && destination=="Mysore")
			 {
				 System.out.println("source="+source+ "destination="+destination);
			      return 18.40;			 
			 }
			 
			 if(source=="Mysore" && destination=="Gubbi")
			 {
				 System.out.println("source="+source+ "destination="+destination);
				 return 24.82;
				 
			 }
			   return 0;
			 
		 }
	
	
	
static double Transport(String source,String destination,String ontime)
	{
		      System.out.println("Transport which includes source and destination");
			  
			  if(ontime=="Yes")
			  {
				  System.out.println("if we able to reach on time");
				  return 1;
			  }
       else		
		   
	              System.out.println("if we not able to reach on time");
			      return 0;
	
	}
	
static boolean Transport(String destination)
    {
	           System.out.println("Transport which includes only destination");
			   
			   if(destination=="able reach")
			   {
				   System.out.println("specified place we able to reached");
				   return true;		   
			   }
			   
			   if(destination=="not able to reach")
			   {
				   System.out.println("specified place we didn't able to reach");
				   return false;
			   }
static boolean Transport(String destination,boolean Ontime)
      {
	          System.out.println("Transport which includes only destination and Ontime");
			  System.out.println("destination"+ destination");
			  if(Ontime==true)
			  {
				  System.out.println("able to reach Ontime");
				  return true;
			  }
	
	           if(Ontime==false)
			   {
				   System.out.println("not able to reach");
				   return false;
			   }
			   return true;
      }		 
	 
    }	
	
	
}
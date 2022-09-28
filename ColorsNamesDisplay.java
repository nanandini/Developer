class ColorsNamesDisplay
{
	static int position=0;
	static String[] listOfColors={null,null,null,null,null,null,null};
	
	static void save(String data)
	{
		 if(data!=null && data.length()>3)
		{
			
		   if(position>=7)
		 {
			System.out.println("colors names exceed");
            return;			
				   
	      } 
		  
		  
		
		  System.out.println("ENTERD COLORS LIST");
		  listOfColors[position]=data;
		  
		  System.out.println("listOfColorsare"+listOfColors[position]+"position:"+position);
		  position++;
		  System.out.println("List of colors");
		  
		  
		}
		else
		{
			System.out.println("COLORS LIST ARE NOT VALID"+data);
			
		}
		
	}
      static void displayListOfColors()
	    {
		  System.out.println("displaying list of colors");
	      for(int index=0;index<listOfColors.length;index++)
		  
	      {
			  
		        System.out.println("colors list are :"+listOfColors[index]);
			 
	      }
		  
        }  
	  
	  static boolean findColor(String nameOfColor)
	  {
		  for(int index=0;index<listOfColors.length;index++)
		  {	  
			  if(listOfColors[index]==nameOfColor)
			  return true;
		  }
		  
		  return false;
	  }
}
	

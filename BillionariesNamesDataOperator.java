class BillionariesNamesDataOperator
{
	static int position=0;
	static String[] listOfBillionariesNames={null,null,null,null,null,null,null,null,null,null};
	
	static void save(String data)
	{
		
		

		 if(data!=null && data.length()>3)
		{
			
		   if(position>=10)
		 {
			System.out.println("Billionaries names exceed");
            return;			
				   
	      } 
		  
		  
		
		  System.out.println("ENTERD billionaries LIST");
		  listOfBillionariesNames[position]=data;
		  
		  System.out.println("listOfbillionariesare "+listOfBillionariesNames[position]+"position:"+position);
		  position++;
		  System.out.println("save");
		  
		  
		}
		else
		{
			System.out.println("billionaries LIST ARE NOT VALID"+data);
			
		}
		
	}
      static void displayListOfBillionaries()
	    {
		  System.out.println("displaying details");
	      for(int index=0;index<listOfBillionariesNames.length;index++)
		  
	      {
			  
		        System.out.println("list are :"+listOfBillionariesNames[index]);
			 
	      }
		  
        }  
	  
	  static boolean findBillionaries(String names)
	  {
		  for(int index=0;index<listOfBillionariesNames.length;index++)
		  {	  
			  if(listOfBillionariesNames[index]==names)
			  return true;
		  }
		  
		  return false;
	  }
	  
	  static String updateBillionaries(String oldNames,String newNames)
	  {
		  
		  if(oldNames!= null && newNames!= null)
		  {
			  System.out.println("updating method");
			  for(int index=0;index<listOfBillionariesNames.length;index++)
			  {
				  if(oldNames==listOfBillionariesNames[index])
				  {
					  String ref=listOfBillionariesNames[index];
					  System.out.println("Billionaries data:"+ref+"at index:"+index+"updated:"+newNames);
					  listOfBillionariesNames[index]=newNames;
				  }
			  }
		  }
		 else
		    {
			 System.out.println("given data is invalid");
		    } 
			return null;
	  }
	  
	  
	  
	  static String updateBillionaries(String oldNames,int index)
	  {
		  if(oldNames!=null)
		  {
			  
			  System.out.println("updating list");
			  String ref=listOfBillionariesNames[index];
			  System.out.println("Billionaries data:"+ref+"updated: "+oldNames+" index:"+index);
			  listOfBillionariesNames[index]=oldNames;
			  return oldNames;
		  }
		  else
		  {
			  System.out.println("given data is invalid");
			  
		  }
		  return null;
	  }
	  
	  
	  static boolean deleteBillionaries(int index)
	  {
		    if(listOfBillionariesNames[index]!=null)
			{
				
				  System.out.println("deleting list");
				  listOfBillionariesNames[index]=null;
				  System.out.println("deleting null:"+index);
				  return true;
			}
			else
			{
				System.out.println("it won't delete null");
			}
			return false;
	  }
	  
	  static boolean deleteBillionaries(String names)
	  {
		  
		  if(names!=null)
		  {
			  System.out.println("delete the list of names");
			  for(int index=0;index<listOfBillionariesNames.length;index++)
			  {
				  
				  if(names==listOfBillionariesNames[index])
				  {
					  
					  String ref=listOfBillionariesNames[index];
					  System.out.println("listOfBillionariesNames data:"+ref+"deleting null:"+index);
					  listOfBillionariesNames[index]=null;
					  return true;
				  }
			  }
			  
		  }
		  else{
			      System.out.println("given data is invalid");
		  }
		  return false;
	  }
}
	

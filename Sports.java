class Sports{
	
	static void Cricketteammembers(String[] names)
	{
		
		  System.out.println("Starting");
		  System.out.println("totalTeammembers:"+names.length);
		  
		  
		  for(int index=0; index<names.length; index++)
		  {
			  String ref =names[index];
			  System.out.println(ref);		  
		  }
		  System.out.println("Ending");
	}
	
  static void KabbadiTeamMembersJerseyNos(int[]Numbers)
    {
	      System.out.println("starting of kabbaditeam jersey numbers");
		  System.out.println("totalteamjerseynumbers:"+Numbers.length);
		  
		  for(int index=0; index<Numbers.length; index++)
		  {
			   int ref =Numbers[index];
			   System.out.println(ref);  
		  }
		  System.out.println("Ending of the kabbadijersey numbers");
    }
	
static void FootBallTeamMembersNumbers(double[] salaries)
	{
		System.out.println("Foodball game starting");
		System.out.println("totalteamfootballmembers:"+salaries.length);
		
		for(int index=0; index<salaries.length; index++)
		{
			double ref =salaries[index];
			System.out.println(ref);
		}
		 System.out.println("Foodball game Ending");
	}
	
static void LudoTeamMobileNumbers(long[] numbers)
	{
		System.out.println("Starting of Ludo team members");
		System.out.println("totalteamludomembers:"+numbers.length);
		
		for(int index=0; index<numbers.length; index++)
		{
			long ref =numbers[index];
			System.out.println(ref);
		}
		 System.out.println("ludo game Ending");
	}
static void HockeyTeamMembersNoOfMatches(int[] Matches)	
    {
	    System.out.println("Starting of hockey match");
		System.out.println("totalteammembersofhockey:"+ Matches.length);
		
		for(int count=0; count<Matches.length; count++)
		{
			int ref =Matches[count];
			System.out.println(ref);
			
		}
	     System.out.println("Ending of hockey match");
    }
static void KhokhoTeamMembersNoOfCountryCode(long[] Codenames)
    {
	     System.out.println("Starting of khokho team");
		 System.out.println("totalteamcountrynames:"+ Codenames.length);
		 
		 for(int index=0; index<Codenames.length; index++)
		 {
			 long ref =Codenames[index];
			 System.out.println(ref);
			 
		 }
		  System.out.println("Ending of khokho match");
    }	
}
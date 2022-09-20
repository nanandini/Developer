class Spicejet{
	
	
	static void Flightnos(String[] Flightnos){
		
          System.out.println("Starting");
		  System.out.println("totalnoofflightnos:"+Flightnos.length);
		  
		  for(int index=0; index<Flightnos.length; index++)
		  {
			String ref = Flightnos[index];
			 System.out.println(ref);
		  }
			System.out.println("Ending");
	}
}
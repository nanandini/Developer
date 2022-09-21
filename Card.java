class Card
{
	static String type;
	static int height;
    static double weight;
	static int price;
    static String[] colours;
	
	
	static void displayDetails()
	{
		
		System.out.println(type);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(price);
		 
		 if(colours!=null)
		 {
			 System.out.println("array is pointing to memory");
			 for(int count=0; count<colours.length;count++)
			 {
				 String ref=colours[count];
				 System.out.println(ref+"count" + count);
			 }
			 
		 }
		 else{
			 System.out.println("Array not pointing to memory");
			 
		 }
	}
	
	
	
}
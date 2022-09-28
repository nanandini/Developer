class  ColorsNamesDisplayRunner
{
	  public static void main(String[] colors)
	  {
		  
		  System.out.println(" starting of main method");
		  
		  ColorsNamesDisplay.save("Green");
		  ColorsNamesDisplay.save("Blue");
		  ColorsNamesDisplay.save("yellow");
		  ColorsNamesDisplay.save("white");
	      ColorsNamesDisplay.save("black");
		  ColorsNamesDisplay.save("gray");
		  ColorsNamesDisplay.save("pink");
		  ColorsNamesDisplay.save("orange");
		  ColorsNamesDisplay.save("Green");
		  
		   ColorsNamesDisplay.displayListOfColors();
		   
		   boolean ref=ColorsNamesDisplay.findColor("red");
		   System.out.println("list od colors found:"+ref);
		   System.out.println("ending of main method");
		   
		  
	  }
	
	
	
}
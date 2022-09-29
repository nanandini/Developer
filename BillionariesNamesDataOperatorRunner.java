 class BillionariesNamesDataOperatorRunner
{
	  public static void main(String[] Operators)
	  {
		  
		  System.out.println(" starting of main method");
		  
		  BillionariesNamesDataOperator.save("Mukesh Ambani");
		  BillionariesNamesDataOperator.save("Bill Gates");
		  BillionariesNamesDataOperator.save("Lakshmi Mittal");
		  BillionariesNamesDataOperator.save("Anil Ambani");
	      BillionariesNamesDataOperator.save("Savitri Jindal");
		  BillionariesNamesDataOperator.save("Anu Aga");
		  BillionariesNamesDataOperator.save("N R Narayana Murthy");
		  BillionariesNamesDataOperator.save("Azim Premji");
          BillionariesNamesDataOperator.save("Adi Godrej");
		  BillionariesNamesDataOperator.save("Dilip Shanghvi");
		  
		  BillionariesNamesDataOperator.displayListOfBillionaries();
		   
		   boolean ref=BillionariesNamesDataOperator.findBillionaries("Anu Aga");
		   System.out.println("list of Billionaries found:"+ref);
		   
		   BillionariesNamesDataOperator.updateBillionaries("N R Narayana Murthy","Larry Page");
		   BillionariesNamesDataOperator.displayListOfBillionaries();
		   
		   BillionariesNamesDataOperator.updateBillionaries("Bill Gates","sergery brain");
		   BillionariesNamesDataOperator.displayListOfBillionaries();
		   
		   boolean delete1 = BillionariesNamesDataOperator.deleteBillionaries("Azim Premji");
			
			System.out.println("deleted:"+delete1);
			 BillionariesNamesDataOperator.displayListOfBillionaries();
		   
		   
		   System.out.println("ending of main method");
		   
		  
	  }
	
	
	
}
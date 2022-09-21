class CardRunner{
	
	
	public static void main(String[] Usage)
	{
		System.out.println("main method is starting");
		
		Card. displayDetails();
		
		Card.type="ATM card";
		Card.height=6;
		Card.weight=150D;
		Card.price=450;
		
		String[] policy={"red","blue","green","white","pink"};
		
		Card.colours=policy;
		
		Card.displayDetails();
		
		
		System.out.println("main method is ending");
	}
	
}
class GroceryStoreRunner{
	
	
	public static void main(String[] thing)
	{
		System.out.println("main method");
		GroceryStore.setplace("chikkaballapur");
		GroceryStore.setname("vishalmart");
		GroceryStore.setitems("yippipackets");
		GroceryStore.setnoOfRooms(6);
		GroceryStore.setvegitables("potato");
		GroceryStore.setlocation("banglore");
		GroceryStore.setbranch("rtnagar");
		GroceryStore.setnoOfDoors(8);
		GroceryStore.setfacilities("good");
		GroceryStore.setowner("myself");
		GroceryStore.setonlinePay("available");
		GroceryStore.setnoOfBills(1890);
		GroceryStore.setnoOfBaskets(29);
		GroceryStore.setlistOrder("unavailable");
		GroceryStore.setnoOfWindows(17);
		
		
		System.out.println("place is "+GroceryStore.getplace());
		
		System.out.println("name is"+GroceryStore.getname());
		
		System.out.println("items are"+GroceryStore.getitems());
		
		System.out.println("noOfRooms"+GroceryStore.getnoOfRooms());
	
		System.out.println("vegitables"+GroceryStore.getvegitables());
		
		System.out.println("location"+GroceryStore.getlocation());
		
		System.out.println("branch"+GroceryStore.getbranch());
		
		System.out.println("noOfDoors"+GroceryStore.getnoOfDoors());

		System.out.println("facilities"+GroceryStore.getfacilities());

		System.out.println("owner"+GroceryStore.getowner());
		
		System.out.println("onlinePay"+GroceryStore.getonlinePay());
		
		System.out.println("noOfBills"+GroceryStore.getnoOfBills());
		
		System.out.println("noOfBaskets"+GroceryStore.getnoOfBaskets());
		 
		 System.out.println("listOrder"+GroceryStore.getlistOrder());
		  
		  System.out.println("noOfWindows"+GroceryStore.getnoOfWindows());
		  
		System.out.println("ending");
		
		
	}
}
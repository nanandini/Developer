class VehicleRunner
{
	 public static void main(String[] safezone)
	 {
		 
		double distance=Vehicle.Transport("chikkaballapur","Banglore"); 
		 
		 System.out.println("distance="+distance);
		 Vehicle.Transport("chikkaballapur","Banglore","Yes");
		 Vehicle.Transport("chikkaballapur","Banglore","No");
		 Vehicle.Transport("not able reach");
		 Vehicle.Transport("reached");
		
		 
	 }
	
	
	
}
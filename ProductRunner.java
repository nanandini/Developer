class ProductRunner
{
	 public static void main(String[] productbase)
	 {
		 
	 System.out.println("main method starting");
		 
		  String nameOfProduct=productbase[0];
          System.out.println("product name : "+nameOfProduct);

          String productType=productbase[1];
          System.out.println("product type : "+productType);

          String productPrice=productbase[2];
          System.out.println("product price : "+productPrice);
          
		  String productQuantity=productbase[3];
		  System.out.println("product quantity :"+productQuantity);
		  
		  String productQuality=productbase[4];
		  System.out.println("product quality :"+productQuality);
		  
		  
		  int convertedproductPrice=Integer.parseInt(productPrice);
		  System.out.println("converted productPrice="+ convertedproductPrice);
		  
		  int convertedproductQuantity=Integer.parseInt(productQuantity);
		  System.out.println("converted  productQuantity="+convertedproductQuantity);
		  
		  long convertedproductQuality=Integer.parselong(productQuality);
		  System.out.println("converted productQuality="+convertedproductQuality);
		  
		  
		  System.out.println("total productPrice="+totalproductPrice);
		  System.out.println("main method ending");
		  
		  
          		  
	 }
	
	
}
class ToothPasteRunner
{
	
	public static void main (String [] purchase)
	{
		System.out.println("Starting main");
		
		ToothPaste.setcolour("blue");
		System.out.println("colour is "+ToothPaste.getcolour());
		
		ToothPaste.setbrand("colgate");
		System.out.println("brand is "+ToothPaste.getbrand());
		
		ToothPaste.setprice(40);
		System.out.println("price is "+ToothPaste.getprice());
		
		ToothPaste.setmobileNo(9900276144L);
		System.out.println("mobileNo is "+ToothPaste.getmobileNo());
		
		ToothPaste.setwarning("keep it out from kids");
		System.out.println("warnings are "+ToothPaste.getwarning());
		
		ToothPaste.setMFD("30 months from Mfd");
		System.out.println("MfD are "+ToothPaste.getMFD());
		
		ToothPaste.setextra(true);
		System.out.println("extra if "+ToothPaste.getextra());
		
		ToothPaste.settype("active salt");
		System.out.println("type are "+ToothPaste.gettype());
		
		ToothPaste.setnetWeight(46);
		System.out.println("netWeight "+ToothPaste.getnetWeight());
		
		ToothPaste.setsize('m');
		System.out.println("size "+ToothPaste.getsize());
		
		ToothPaste.setingredients("sodium fluriod");
		System.out.println("ingredients "+ToothPaste.getingredients());
		
		ToothPaste.setexpiryDate("20 months before");
		System.out.println("expiryDate is "+ToothPaste.getexpiryDate());
		
		ToothPaste.setactiveIngredients("water");
		System.out.println("activeIngredients are "+ToothPaste.getactiveIngredients());
		
		ToothPaste.setdirections("brush atleast twice a day");
		System.out.println("directions "+ToothPaste.getdirections());
		
		System.out.println("ending");
	}
	
	
}
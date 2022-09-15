class Identity{
	
	static void printName(String name)
	{
		System.out.println("Name : "+name);
	}
	//----------1
	static void printNameAndEmail(String name,String email)
	{
		System.out.println("Name : "+name+">>> Email: "+email);
	}
	//----------2
	static void printNameAndAge(String name,byte age)
	{
		System.out.println("Name : "+name+">>> Age:"+age+"Years");
	}
	//-----------3
	static void printNameAndAddress(String name,String adress)
	{
		System.out.println("Name : "+name+">>> Address:"+adress);
	}
	//------------4
	static void printNameAndEmailAndAddressAndAge(String name,String email,String adress,byte age)
	{
		System.out.println("Name : "+name+">>> Email: "+email+">>> Address:"+adress+">>> Age:"+age+"Years");
	}
	//------------5
	static void printNameAndGender(String name,char gender)
	{
		System.out.println("Name : "+name+">>> Gender:"+gender);
	}//------------6
	static void printNameAndWorking(String name,boolean workStatus)
	{
		System.out.println("Name : "+name+">>> Employmentstatus-working:"+workStatus);
	}//------------7
	static void printNameAndShirtSize(String name,byte shirtsize)
	{
		System.out.println("Name : "+name+">>> ShirtSize:"+shirtsize);
	}//------------8
	static void printNameAndPantSize(String name,byte pantsize)
	{
		System.out.println("Name : "+name+">>> PantSize:"+pantsize);
	}//------------9
	static void printNameAndWeightAndHeight(String name,float wt,float ht)
	{
		System.out.println("Name : "+name+">>> Weight in kg: "+wt +">>> Height in cms:"+ht);
	}//------------10
	static void printNameAndMobile(String name,long mobileNum)
	{
		System.out.println("Name : "+name+">>> Contact No.:"+mobileNum);
	}//----------------11
}//---------end of class Identity
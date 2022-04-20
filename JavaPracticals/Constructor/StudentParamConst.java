class StudentParamConst
{

	int sId;
	String sName;
	String state;
	String city;
	int pincode;
	String fName;
	static String sub="Java";


	StudentParamConst(int n,String s,String c,int p)
	{
	sId=n;
	sName=s;
	city=c;
	pincode=p;
	}

	void display()
	{
	System.out.println("---------" +   sub + " ---------");
	System.out.println(sId + " " + sName);
	//System.out.println(city + " " + pincode + " " + fName);
	}

}
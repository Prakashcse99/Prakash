class Armstrong
{
	public static void main(String args[])
	{
		int n,r,p,t;
		n=152;
		t=n;
		p=0;
		while(n>0)
		{
			r=n%10;
			p=p+(r*r*r);
			n =n/10;
		}	
		System.out.println("Number "+t);
		if(p==t)
			System.out.println("Armstrong number");
		else
			System.out.println("Not a armstrong number");
	}
}
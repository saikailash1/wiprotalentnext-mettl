    int n = input1;
		int temp=0,m=0;
		while(n>0)
		{
			m = n%10;
			temp = (temp*10)+m;
			n=n/10;
		}
		if(temp==input1)
		{
			return 2;
		}
		else 
		{
			return 1;
		}

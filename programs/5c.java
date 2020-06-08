int n = input1,sum=0,m=0;
		while (n!=0) {
            m = n%10;
			if(m%2!=0)
			{
				sum=sum+m;
			}
            n = n / 10;
        }
		return sum;
	}
}

		int a = input1;
		int b = input2;
		int c = input3;
		int totwt=0;
		for(int i=0;i<input1;i++)
		{
			for(int j=0;j<=i;j++)
			{
				totwt = totwt+b;
			}
			b = b+c;
		}
		return totwt;
	}

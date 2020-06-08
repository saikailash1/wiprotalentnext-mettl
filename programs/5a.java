	int n = input1,temp=0,count=0,sum=0,fsum=0;
		while (n!=0) {
            sum = sum + n % 10;
            n = n / 10;
        }
		fsum = (sum/10)+(sum%10);
		return fsum;
	}
}

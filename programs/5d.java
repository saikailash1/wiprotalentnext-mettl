        int n = input1,sumO=0,sumE=0,m=0;
        while (n!=0) {
            m = n%10;
            if(m%2==0)
            {
                if(m==1)
                {
                    sumO=sumO+m;
                }
                sumE=sumE+m;
            }
            else
            {
                sumO=sumO+m;
            }
            n = n / 10;
        }
        if(input2=="even")
        {
            return sumE;
        }
        else
        {
            return sumO;
        }
    }
}


class Temple
{
	public static void main(String[] args)
    	{
		int i,j,k,space=40;
	
	//traingle

		for(i=1;i<=5;i++)
	  	{ 
    			for(k=1;k<=space;k++)
   			{
    				System.out.print(" ");
    			}
    			for(j=1;j<=i;j++)
    			{
    				System.out.print("*");
    			}
    			System.out.println();
  		}

	//stick

		for(i=1;i<=5;i++)
		{
    			for(k=1;k<=space;k++)
			{
    				System.out.print(" ");
    			}
    			for(j=1;j<=1;j++)
    			{
    				System.out.print("*");
    			}
    			System.out.println();
  		}

	//traingle

		for(i=1;i<=9;i=i+2)
  		{
    			for(k=1;k<=space;k++)
    			{
    				System.out.print(" ");
    			}
    			for(j=1;j<=i;j++)
    			{
			    System.out.print("*");
    			}
			System.out.println();
    			space --;
		}

	//rectangle

        	space=36;
		for(i=1;i<=9;i++)
  		{
       			for(k=1;k<=space;k++)
       			{
         			System.out.print(" ");
       			}
   			for(j=1;j<=9;j++)
    			{
    				if(j>3&&j<=6)
       				{
         				System.out.print(" ");
       				}
    				else
       				{
         				System.out.print("*");
       				}
    			}
    			System.out.println();
  		}

	//sidhi

    		space=35;
    		for(i=11;i<=17;i=i+2)
  		{
    			for(k=1;k<=space;k++)
    			{
    				System.out.print(" ");
    			}
    			for(j=1;j<=i;j++)
    			{
    				System.out.print("*");
    			}
   			System.out.println();
    			space --;
  		}
	}
}
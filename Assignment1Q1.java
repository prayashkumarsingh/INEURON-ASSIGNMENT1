public class Assignment1Q1
{

	public static void main(String[] args)
    {
		
		
		int n=4;
        for(int i=0; i<n; ++i)
        {
            for(int j=0; j<n; ++j)
            {
                if(i==0)
                {
                    System.out.print(1);
                }
                else if(i==n/4)
                {
                    System.out.print(2);
                }
                else if(i==n/2)
                {
                    System.out.print(3);
                }
                else if (i==3*n/4)
                {
                    System.out.print(4);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

	}

}
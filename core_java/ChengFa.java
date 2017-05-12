public class ChengFa
{
	public static void main(String[] args)
	{
		final int NMAX = 9;

		int[][] odds = new int[NMAX][];
		for(int n=0;n<NMAX;n++)
			odds[n] = new int[n+1];

		for(int n=0;n<odds.length;n++)
			for(int k= 0 ;k<odds[n].length;k++)
			{
			//	int lotteryOdds = 1;
			//	for(int i=1;i<k;i++)
			//		lotteryOdds = lotteryOdds*(n-i+1)/i;

			//	odds[n][k] = lotteryOdds;
				odds[n][k] = (k+1)*(n+1);
		   	}

		for(int n=0;n<odds.length;n++)
		{
			for(int k=0;k<odds[n].length;k++)
				System.out.printf("%d*%d=%-4d",k+1,n+1,odds[n][k]);
			System.out.println();
		}
	}
}



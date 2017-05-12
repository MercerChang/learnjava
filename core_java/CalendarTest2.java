import java.time.*;

public class CalendarTest2
{
	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		int year = date.getYear();
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();

		for(int mon =1;mon<13;mon++)
		{
			LocalDate cal = LocalDate.of(year,mon,1);
			int value = cal.getDayOfWeek().getValue();

			System.out.printf("%d年%d月",cal.getYear(),cal.getMonthValue());
			System.out.println();
			System.out.println("Mon Tue Wed Thu Fri Sat Sun");
			for(int i=1;i<value;i++)
			System.out.print("    ");

			while(cal.getMonthValue() == mon)
			{
				System.out.printf("%3d",cal.getDayOfMonth());
				if(cal.getMonthValue() == month && cal.getDayOfMonth() == today)
					System.out.print("*");
				else
					System.out.print(" ");
				cal = cal.plusDays(1);
				if(cal.getDayOfWeek().getValue() == 1)
					System.out.println();
			}
			System.out.println();
			System.out.println();
		}
	}
}

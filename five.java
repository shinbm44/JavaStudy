package Week_1;



import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class five {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("[달력 출력 프로그램]");
		System.out.println();
		System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
		int years = sc.nextInt();
		//System.out.println();
		System.out.print("달력의 월을 입력해 주세요.(mm)");
		int month = sc.nextInt();
		
		LocalDate date = LocalDate.of(years, month, 1);

		int day = date.getDayOfWeek().getValue();
		//System.out.println(day);
		//요일
		int endDay = date.lengthOfMonth();
		
		
		System.out.println(String.format("[%d년 %d월]", years, month));
		System.out.println("일\t월\t화\t수\t목\t금\t토\t");
		
		
		for( int i =0; i< day%7; i++) {
			System.out.print("\t");
		}
		
		for( int i =1; i<= endDay; i++) {
			System.out.printf(String.format("%02d\t", i));
			day++;
			if(day%7==0) {
				System.out.println();
			}
		}
		
	}

}

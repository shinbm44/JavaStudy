package Test_1;

import java.util.Random;

public class six {

	public static void main(String[] args) {

		Random ran = new Random();

		double prog = 0; //진행
		int OneCand = 0;//1번
		int TwoCand = 0;//2번
		int ThreeCand = 0;//3번
		int FourCand = 0;//4번


		for(int i =0; i<10000; i++) {
			int vot = (ran.nextInt(4)+1);

			if(vot==1) {
				OneCand ++;

			} else if(vot==2) {
				TwoCand ++;

			} else if(vot==3) {
				ThreeCand ++;

			} else if(vot==4) {
				FourCand ++;
			}
			String Who = Person(vot);

			System.out.print("[투표진행률]: ");
			System.out.print(((prog/(double)10000) *100.00)+ "%, " + i + "명 투표 => ");
			System.out.print(Who);
			System.out.println();
			System.out.print("[기호:1] 이재명: ");
			System.out.print(((double)OneCand/(double)10000)* 100.00);
			System.out.print(" , (투표수:" + OneCand+ ")");
			System.out.println();
			System.out.print("[기호:2] 윤석열: ");
			System.out.print(((double)TwoCand/(double)10000)*100.00);
			System.out.print(" , (투표수:" + TwoCand+ ")");
			System.out.println();
			System.out.print("[기호:3] 심상정: ");
			System.out.print(((double)ThreeCand/(double)10000)*100.00);
			System.out.print(" , (투표수:" + ThreeCand+ ")");
			System.out.println();
			System.out.print("[기호:3] 안철수: ");
			System.out.print(((double)FourCand/(double)10000)*100.00);
			System.out.print(" , (투표수:" + FourCand+ ")");
			System.out.println();


		}
		
		

	}

	public static String Person(int vot) {

		if( vot == 1) {
			return "이재명";
		} else if( vot ==2) {
			return "윤석열";
		} else if( vot ==3) {
			return "심상정";
		} else if ( vot ==4) {
			return "안철수";
		}
		return "무효표";
	}
}

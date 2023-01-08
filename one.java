package Test_1;

public class one {

	public static void main(String[] args) {
		System.out.print("[구구단 출력]");
		System.out.println();
		
		
		
	for( int i = 1; i<10; i++) {
		for( int j =1; j<10; j++) {
			int num = i *j;
				
			System.out.print( String.format("%d", i)
				+ String.format("%2s", "x")
				+ String.format("%2d", j)
				+ String.format("%2s", "=")
				+ String.format("%2d", num)
				+ String.format("%s", "\t")
	
														);	
			}
			System.out.println();
		}
		
		
	}

}

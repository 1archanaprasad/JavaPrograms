package javapracticequestions;

public class Naturalnumbersum {

	public static void main(String[] args) {
		int num = 5;
		int sum = 0;
		
		//1+2+3+....100 ==>5050
		
		for(int i = 1; i<=num;i++) {
			sum = sum + i;
		}
		System.out.println("sum is: "+sum);
	}

}
 
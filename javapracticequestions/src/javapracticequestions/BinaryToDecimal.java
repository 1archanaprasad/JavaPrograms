package javapracticequestions;

public class BinaryToDecimal {

	public static void main(String[] args) {
		long num = 1001; 
		int decimal = convertBinaryToDecimal(num);
		System.out.println(decimal);
	}
	
	public static int convertBinaryToDecimal(long num) {
		int decimalNumber = 0;
		int i = 0;
		long remainder;
		while (num!=0) {
			remainder = num % 10;
			num = num/10;
			//decimalNumber = decimalNumber + (remainder*Math.row(2,i));
			decimalNumber += remainder * Math.pow(2, i);
			++i;
		}
		return decimalNumber;
	}
}


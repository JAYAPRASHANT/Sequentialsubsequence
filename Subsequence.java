package Subsequences;
import java.util.Scanner;
public class Subsequence {

	public static int sequence(String str) {
		int result=0,a=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'A') {
				a++;
			}
			else if(str.charAt(i) == 'G') {
				result +=a;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int value=sequence(str);
		System.out.println(value);

	}

}
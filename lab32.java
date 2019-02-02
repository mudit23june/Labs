package smartbatch;

import java.util.Arrays;
import java.util.Scanner;

public class lab32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t;
		char[] t2 = new char[20];
		char[] temp = new char[20];
		t = s.toLowerCase();
		t2 = t.toCharArray();
		temp = t.toCharArray();
		Arrays.sort(temp);
		String t3 =new String(t2);
		String t4 =new String(temp);
		if(t3.equals(t4))
			System.out.println("Positive");
		else
			System.out.println("Not");
	}

}

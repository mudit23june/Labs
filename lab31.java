package smartbatch;


import java.util.Arrays;
import java.util.Scanner;

public class lab31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int n,j;
		char[] ar = new char[20];
		char[] temp = new char[20];
		System.out.println("Enter string\n");
		s = sc.next();
		ar = s.toCharArray();
		temp=ar;
		System.out.println("Enter a choice\n");
		System.out.println("1. Add the string to itself");
		System.out.println("2. Replace odd positions with #");
		System.out.println("3. Remove duplicate characters");
		System.out.println("4. Change odd characters to upper case");
		System.out.println("5. Exit");
		
		
		while(true)
		{
			n = sc.nextInt();
			switch(n)
			{
				case 1: System.out.println(s+s);
						break;
				case 2: temp = Arrays.copyOf(ar, ar.length);
						for(j=0; j<temp.length; j++)
						{
							if(j%2==0)
								temp[j] = '#';
						}
						temp.toString();
						System.out.println(temp);
						break;
				case 3: temp = Arrays.copyOf(ar, ar.length);
						int k = temp.length;
						for(j=0; j<k-1; )
						{
							if(temp[j] == temp[j+1])
							{
								for(int m=j; m<k-1; m++)
								{
									temp[m] = temp[m+1];
									
								}
								k = k - 1;
							}
							else
							{
								j++;
							}
						}
						for(int m=k; m<temp.length; m++)
								temp[m] = '\0';
						temp.toString();
						System.out.println(temp);
						break;
				
				case 4: temp = Arrays.copyOf(ar, ar.length);
						for(j=0; j<temp.length; j++)
						{
							if((j%2==0)&&(Character.isLowerCase(temp[j])))
								temp[j] = Character.toUpperCase(temp[j]);
						}
						temp.toString();
						System.out.println(temp);
						break;
				case 5: System.exit(0);
						break;
				default: System.out.println("you have entered an invalid choice");
						 break;
		
			}
		}
	}

}

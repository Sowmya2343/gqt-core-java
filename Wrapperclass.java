import java.util.Scanner;
public class Wrapperclass {
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  byte data:");
		Byte b = sc.nextByte();
		System.out.println("The byte data:"+b);
		System.out.println("--------------------");

		System.out.println("Enter the  short data:");
		Short s = sc.nextShort();
		System.out.println("The Short data:"+s);
		System.out.println("--------------------");

		System.out.println("Enter the  Integer data:");
		Integer i=sc.nextInt();
		System.out.println("The Integer data:"+i);
		System.out.println("--------------------");

		System.out.println("Enter the  long data:");
		Long l = sc.nextLong();
		System.out.println("The long data:"+l);
		System.out.println("--------------------");

		System.out.println("Enter the  float data:");
		Float f=sc.nextFloat();
		System.out.println("The float data:"+f);
		System.out.println("--------------------");

		System.out.println("Enter the double data:");
		Double d = sc.nextDouble();
		System.out.println("The Double data:"+d);
		System.out.println("--------------------");

		System.out.println("Enter the  String data:");
		String str=sc.nextLine();
		System.out.println("The String data:"+str);
		System.out.println("--------------------");

		System.out.println("Enter the  character data:");
		Character c = 'a';
		System.out.println("The character data:"+c);
		System.out.println("--------------------");
		
		Boolean b1= true;
		System.out.println("The boolean data:"+b1);
		System.out.println("--------------------");
                sc.close();
	}	

     }
package module1;

public class ArrayMatchesFunction 
{
	public static void main(String[] args) 
	{
	String s="Ramdas";
	String b="234";
	boolean m= s.matches("r(.*)"); //checks if string starts with r
	System.out.println(m);
	System.out.println(s.matches("(.*)s")); //checks if string ends with s
	System.out.println(b.matches("(.*)MAN(.*)")); //checks if string contains MAN
	System.out.println(b.matches("(......)")); //checks if string contains MAN
		}
}

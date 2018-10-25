import java.util.*;
public class q3_print_any_array__generic
{
	public static void main(String arsg[])
	{
		Integer it[]={25,85,96,74,12};
        Double dd[]={85.2,65.2,45.9,11.2,77.5};
        Character ch[]={'l','t','a','s','b'};
        String s[]={"hp","lenovo","asus","mackbook","dell"};
		demo d=new demo();
        System.out.println("\nInteger :-");
       
        d.print(it);
        System.out.println("\nDouble :-");
        
        d.print(dd);
        System.out.println("\nCharacter :-");
        
        d.print(ch);
        System.out.println("\nString :-");
        
        d.print(s);
	}
}

class demo<T extends Comparable<T>>
{
	public static <T extends Comparable>void print(T a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

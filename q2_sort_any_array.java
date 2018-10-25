import java.util.*;
public class q2_sort_any_array {
    public static void main(String args[]) {
        Integer it[]={25,85,96,74,12};
        Double dd[]={85.2,65.2,45.9,11.2,77.5};
        Character ch[]={'l','t','a','s','b'};
        String s[]={"hp","lenovo","asus","mackbook","dell"};
        demo d=new demo();
        System.out.println("\nInteger :-");
        d.sort(it);
        d.print(it);
        System.out.println("\nDouble :-");
        d.sort(dd);
        d.print(dd);
        System.out.println("\nCharacter :-");
        d.sort(ch);
        d.print(ch);
        System.out.println("\nString :-");
        d.sort(s);
        d.print(s);
    }
}
class demo<T extends Comparable<T>>
{
    public static<T extends Comparable> void sort(T it[])
    {
        Arrays.sort(it);
    }
    public static<T extends Comparable> void print(T it[])
    {
        for(int i=0;i<it.length;i++)
        {
            System.out.print(it[i]+" ");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class stringsort {
    public static String sort(String s)
    {
        char arr[]=s.toCharArray();
       Arrays.sort(arr);
       String str=new String(arr);
       return str;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String");
        String s=sc.nextLine();
         System.out.print(sort(s));
    }
}

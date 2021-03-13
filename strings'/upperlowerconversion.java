//way1 
package strings;
import java.util.*;

public class upperlowerconversion {
    public static void convert(String str)
    {
        int len=str.length();
       
       
        for(int i=0;i<len;i++)
        {
            int ch=str.charAt(i);
            if(ch>=65&&ch<=90)
            {
                ch=ch+32;
            }
           else if(ch>= 97&&ch<=122)
            {
                ch=ch-32;
            }
            if(ch==32)
            {
                System.out.print(" ");
            }
            System.out.print((char)ch);  
        }  
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String");
        String str=sc.next();
        convert(str);
        
        
    }
}


----------------------------------------------------
//way2
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
public class upperlowerconversion {
        public static void convert(String str)
    {
        int len=str.length();
       StringBuffer st=new StringBuffer(str);
        for(int i=0;i<len;i++)
        {
           
            if(Character.isLowerCase(str.charAt(i)))
            {
                st.setCharAt(i,Character.toUpperCase(str.charAt(i)));
            
        }
            if(Character.isUpperCase(str.charAt(i)))
            {
                st.setCharAt(i,Character.toLowerCase(str.charAt(i)));
            }
        }
        System.out.println(st);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String");
        String str=sc.next();
        
        convert(str);
        
        
    }
}



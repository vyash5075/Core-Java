
package strings;


//way 1 by taking extra  new array
import java.util.*;
public class newbie {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char arr[]=new char[s.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.charAt(s.length()-i-1);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }      
    }
}

--------------------------------------------------------
//way2 by taking extra new string

package strings;

import java.util.*;
public class newbie {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ss="";
        for(int i=s.length()-1;i>=0;i--){
            
            ss+=s.charAt(i);
        }
        
            System.out.print(ss);
           
    }
}

----------------------------------------------------------
//way3 by converting to string builder 


package strings;

import java.util.*;
public class newbie {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            System.out.print(sb);         
    }
}


----------------------------------------------------------
//way 4 by swapping      optimised way

package strings;

import java.util.*;
public class newbie {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int mid=n/2;
        char arr[]=s.toCharArray();
        for(int i=0;i<mid;i++){
            char temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.println(new String(arr));
    }
}



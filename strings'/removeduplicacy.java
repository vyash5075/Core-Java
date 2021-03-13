//by simple loop
package strings;
import java.util.*;
public class newbie {
    
    
    
    
    public static void removeduplicacy(String s){
        for(int i=0;i<s.length();i++){
            
            boolean duplicate=false;
            for(int j=i+1;j<s.length();j++){
                
                if(s.charAt(i)==(s.charAt(j))){
                    duplicate=true;
                }
            }
            if(!duplicate){
                System.out.print(s.charAt(i));
            }
        }
    }
    public static void main(String args[]){
        newbie n=new newbie();
        Scanner sc=new Scanner(System.in);
        String  s=sc.nextLine();
        removeduplicacy(s);
    }
}
------------------------------------------------------
// sorting

package strings;
import java.util.*;
public class newbie {
    
    
    
    
    public static void removeduplicacy(String s){
        char a[]=s.toCharArray();
        Arrays.sort(a);
      
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                System.out.println(a[i]);
            }
           
        }
         System.out.println(a[a.length-1]);
      
    }
    public static void main(String args[]){
        newbie n=new newbie();
        Scanner sc=new Scanner(System.in);
        String  s=sc.nextLine();
        removeduplicacy(s);
    }
}


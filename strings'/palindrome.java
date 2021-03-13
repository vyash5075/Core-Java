
package strings;
import java.util.*;
public class palindrome {
    
    //follow divide and conquor approach
    
    public void palindrome(String s){
        int n=s.length();
        boolean flag=true;
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)==s.charAt(n-i-1)){
                continue;
            }
            else{
                flag=false;
                break;
                
            }   
        }
        if(flag){
            System.out.println("palindrome");
        }
        else{
              System.out.println("not palindrome");
        }
        
    } 
    public static void main(String args[]){
        palindrome n=new palindrome();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        n.palindrome(s);
    }
}

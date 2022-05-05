// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String str[] = read.readLine().split(" ");
            String S= str[0];
            int a = Integer.parseInt(str[1]);
            int b = Integer.parseInt(str[2]);
            Solution ob = new Solution();
            System.out.println(ob.stringPartition(S,a,b));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution{
    static String stringPartition(String s, int a, int b){
        int i =0;
        
       while(i<s.length()-1){
           if(Integer.parseInt(s.substring(0,i+1)) % a == 0 && Integer.parseInt(s.substring(i+1,s.length()))%b==0 ){
              return s.substring(0,i+1) +" "+ s.substring(i+1,s.length());
               
           }
           i++;
       }
       if(i==s.length()-1 ){
           return "-1";
       }
       return "";
    }
}
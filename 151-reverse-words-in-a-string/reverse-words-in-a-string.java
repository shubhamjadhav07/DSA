
class Solution {
    //reverse function 
    private void reverse(StringBuilder sb, int start, int end) {
        
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }

    public String reverseWords(String s) {
        s=s.strip();
    
        StringBuilder sb = new StringBuilder(s).reverse(); 
         
       
        for(int i =0;i<sb.length();i++){
           
           
            
            int j = i;
            while(i<sb.length()&&sb.charAt(i)!=' '){
             
                i++; 

            }
            int e = i-1; 
            reverse(sb,j,e); 


        }
        
        return sb.toString().replaceAll(" +"," "); 
    }
}
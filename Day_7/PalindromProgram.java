class Palindrome{
    public void PalindromChecker(String str){
        String originalString=str;
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse +=str.charAt(i);
        }
        if(reverse.equals(originalString)){
            System.out.println("Given String Is: '"+originalString+"' Palindrome");
        }else {
            System.out.println("Given String Is: '" + originalString + "' is Not Palindrome");
        }
    }
}

public class PalindromProgram {
    public static void main(String[] args){
        Palindrome palin=new Palindrome();
        palin.PalindromChecker("madam");
    }
}

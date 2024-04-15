package Packagetest1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str= "abcd", tempstr="";
        char ch;
       
      //System.out.print("Original word: ");
      //System.out.println("Dikshansh"); 
       
      for (int i=0; i<Str.length(); i++)
      {
        ch= Str.charAt(i); 
        tempstr= ch+tempstr;
      }
      
      System.out.println("reverse string is: "+ tempstr);
    }
	}


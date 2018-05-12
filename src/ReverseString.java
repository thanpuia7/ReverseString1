import java.lang.*;
import java.io.*;
import java.util.Scanner;

class ReverseString{

public static void main(String args[]){

String input1=new String();
Scanner in = new Scanner(System.in);

System.out.print("Enter a String: ");
input1=in.nextLine();

StringBuilder input2=new StringBuilder();

input2.append(input1);
input2=input2.reverse();

System.out.println("Reverse of the String Entered is: "+input2);

}
}
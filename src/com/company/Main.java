package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String str = s.nextLine();
        System.out.println(removespace(str));


    }
    public static String removespace(String str){
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==' '){
                str=str.substring(0,i)+str.substring(i+1);
             //  i--;
            }
        }
        return str;
    }
}

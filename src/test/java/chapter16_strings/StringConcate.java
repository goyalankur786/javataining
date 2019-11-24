package chapter16_strings;

import java.sql.SQLOutput;

public class StringConcate {
    public static void main(String[] args) {
        int no=50;
        String str1="Hey"+"Buddy";
        String str2=str1+"Ankur";
        String str3=str1+str2;
        String str4=no+10+str1;
        String str5=str1+no+10;
        String str6=str1.concat("How Are You");
        String str7=str1.concat(str2);
        String str8="Ankur".concat(str1);
        System.out.println("1st string-->"+ str1);
        System.out.println("2nd string-->"+ str2);
        System.out.println("3rd string-->"+ str3);
        System.out.println("4th string-->"+ str4);
        System.out.println("5th string-->"+ str5);
        System.out.println("6th string-->"+ str6);
        System.out.println("7th string-->"+ str7);
        System.out.println("8th string-->"+ str8);
    }
}

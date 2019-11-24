package chapter16_strings;

public class StringCompare {
    public static void main(String[] args) {
        //String str1="Ankur";
        //String str2="Ankur";
        //String str1="Ankur";//unicode value of A=65
        //String str2="Bnkur";//unicode value of B=66
        //String str1="Bnkur";//unicode value of B=66
        //String str2="Ankur";//unicode value of A=65
       // String str1="Ankur";//unicode value of A=65
        //String str2="ankur";//unicode value of a=97
       // String str1="Ankum";//unicode value of m=109
        //String str2="Ankun";//unicode value of n=110
        //String str1="Ankur5";//unicode value of 5=53
        //String str2="Ankur3";//unicode value of 3=52
        String str1="Ankur";//no of strings 5
        String str2="AnkurGoyal";//no of strings 10
        System.out.println("str1 & str2 comparison :"+ str1.compareTo(str2));//65-66=-1 (str1<str2)
    }
}

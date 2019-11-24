package chapter16_strings;

public class StringEquals {
    public static void main(String[] args) {
        String str1="Java Programming";
        String str2="Java programming";
        Boolean b=str1.equals(str2);
        System.out.println(b);

        String str3="Java Programming";
        String str4="JAVA programming";
        boolean b1=str3.equalsIgnoreCase(str4);
        System.out.println(b1);

        boolean b2=str1.equals(str3);
        System.out.println(b2);
    }
}

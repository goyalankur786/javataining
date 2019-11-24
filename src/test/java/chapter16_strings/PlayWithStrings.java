package chapter16_strings;

public class PlayWithStrings {
    public static void main(String[] args) {
        char [] ch={'q','a','r','o','b','o'};
        String s=new String(ch);
        System.out.println(s);
        String string="ankur goyal";

        int a=string.length();
        System.out.println(a);
        boolean b=string.contains("an");
        System.out.println(b);

        boolean c=string.equals("ankur");
        System.out.println(c);

        String d =string.replaceAll("ankur","nitin");
        System.out.println(d);
    }
}

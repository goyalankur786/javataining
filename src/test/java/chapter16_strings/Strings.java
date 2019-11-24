package chapter16_strings;

public class Strings {
    public static void main(String ar[]){
        String str1 = "HeYBuddY";
            String str2 = new String("JAVA");
                  char name[]={'A','N','K','U','R'};
                        String str3=new String(name);
                            String str4=new String(name,2,3);
                                    String str5=new String(str4);
                            System.out.println("First string-->"+ str1);
                        System.out.println("Second string-->"+ str2);
                    System.out.println("Third string-->"+ str3);
                System.out.println("Fourth string-->"+ str4);
            System.out.println("Fifth string-->"+ str5);
        System.out.println("String Length is-->"+ str1.length());
    }
}


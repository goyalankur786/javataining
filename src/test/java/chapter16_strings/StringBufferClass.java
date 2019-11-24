package chapter16_strings;

public class StringBufferClass {
    public static void main(String[] args) {

        StringBuffer str=new StringBuffer();//constructor with no arguments
        System.out.println("str length is-->"+ str.length());//length=0
        System.out.println("str capacity is-->"+ str.capacity());//by default capacity =16

        StringBuffer str1=new StringBuffer(10);//constructor with int size
        System.out.println("str1 length-->"+ str1.length());//length=0
        System.out.println("str2 capacity is-->"+ str1.capacity());//capacity is set to=10

        StringBuffer str2=new StringBuffer("java");//constructor with string argument
        System.out.println("str2 length is"+ str2.length());//string length=4
        System.out.println("str2 capacity is"+ str2.capacity());//4+16(character size+default capacity)=20

        StringBuffer str3=new StringBuffer("Ankum");
        System.out.println("character at index 4->"+ str3.charAt(4));//to get value at particular index using charAt()
        str3.setCharAt(4,'r');//using setCharAt()
        System.out.println("change character at index 4-->"+ str3);

        StringBuffer str4=new StringBuffer("javaprogramming");
        System.out.println("delete character from 2-4-->"+ str4.delete(2,4));
        System.out.println("delete character at index 1-->"+ str4.deleteCharAt(1));

        StringBuffer str5=new StringBuffer("I javaprogramming");
        System.out.println("insert at index 2-->"+ str5.insert(2,"like "));
        System.out.println("append at index 2-->"+ str5.append(".com"));

    }

}

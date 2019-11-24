package chapter16_strings;

public class StringSort {
    static String name[]={"Bilaspur","Raipur","Madras","Allahabad"};//declaring arrays
    public static void main(String[] args) {
        int size=name.length;//declaring size of array
        String temp=null;
        System.out.println("Before sorting");
        for(int i=0;i<size;i++){
            System.out.println(name[i]);//execution before sorting
        }
        for(int i=0;i<size;i++){//outer loop
            for(int j=i+1;j<size;j++){//inner loop
                if(name[i].compareTo(name[j])>0){//if it return negative value then exit from loop other wise swap
                    temp=name[i];
                    name[i]=name[j];
                    name[j]=temp;
                }
            }
        }
        System.out.println("After sorting");
        for (int i=0;i<size;i++){//executing after swapping...
            System.out.println(name[i]);
        }
    }
}

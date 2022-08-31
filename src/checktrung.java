//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class checktrung {
//    public static void main(String [] args) {
//        List<Integer> e = new ArrayList<>();
//        List<Integer> d = new ArrayList<>();
//
//        int[] a = {1, 2, 3, 4, 5};
//        int[] b = {6, 5, 4, 3, 9};
//        int[] c = new int[a.length + b.length];
//
//        System.arraycopy(a, 0, c, 0, a.length);
//        System.arraycopy(b, 0, c, a.length, b.length);
//
//        System.out.println(Arrays.toString(c));
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < b.length; j++) {
//                if (a[i] == b[j]) {
//                    e.add(a[i]);
//                }
//            }
//        }
//        System.out.println(e);
//        int size1 = remove_Duplicate_Elements(c, c.length);
//
//        System.out.println(d);
//
//    }}




import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class checktrung {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {6, 5, 4, 3, 9};

        int aLen = a.length;
        int bLen = b.length;
        int[] arr = new int[aLen + bLen];

        System.arraycopy(a, 0, arr, 0, aLen);
        System.arraycopy(b, 0, arr, aLen, bLen);

        int count = 0;
        Set<Integer> c = new HashSet<>();
        Set<Integer> d = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count == 1){
                c.add(arr[i]);
                count = 0;
            }
            if(count >= 1){
                d.add(arr[i]);
                count = 0;
            }
        }
        System.out.println("Distinct element: " + " "+ c + "  " );
        System.out.println("Duplicate element: " + " "+ d + "  ");
    }
}
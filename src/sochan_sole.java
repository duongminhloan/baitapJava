import java.util.ArrayList;
import java.util.List;

public class sochan_sole {
    public static void main(String [] args){
        List<Integer> c=new ArrayList<>();
        List<Integer> d=new ArrayList<>();
        int [] a={1,2,3,4,5};
        int [] b={6,5,4,3,9};
        for(int i=0; i< a.length; i++){
            if (i%2==0){
               c.add(i);
            }else {
                d.add(i);
            }
        }

        for (int i=0; i<= b.length; i++){
            if (i%2==0){
                c.add(i);

            }else {
                d.add(i);
            }
        }
        System.out.println(c);
        System.out.println(d);
//        int[] a={1, 2, 3, 4, 5};
//        int [] b={6, 5, 4, 3, 9};
//        List<Integer> c=new ArrayList<>();
//        List<Integer> d=new ArrayList<>();
//        for(int i=0; i<a.length; i++){
//            if(i%2==0){
//                c.set(0,i);
//            }else {
//                d.set(0, i);
//            }
//        }

    }
}

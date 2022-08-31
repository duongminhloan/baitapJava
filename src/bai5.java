import java.util.*;

    public class bai5 {
        public static void main(String [] args){
            Integer ar1[] = { 1, 2, 3, 4, 5 };
            Integer ar2[] = { 6,5,4, 3, 9 };
            Integer ar3[] = { 5, 2, 3, 6, 8, 5, 9 };

            List<Integer> a = new ArrayList<>(Arrays.asList(ar1));
            List<Integer> b = new ArrayList<>(Arrays.asList(ar2));
            List<Integer> c = new ArrayList<>(Arrays.asList(ar3));

            a.addAll(b);
            a.addAll(c);
            System.out.println();

            Object[] objects = a.toArray();
            System.out.println(Arrays.toString(objects));


            int count = 0;
            Set<Integer> d = new HashSet<>();
            Set<Integer> e = new HashSet<>();
            for (int i = 0; i < objects.length; i++) {
                for (int j = 0; j < objects.length; j++) {
                    if (objects[i] == objects[j]) {
                        if (j < i) {
                            break;
                        }
                        count++;
                    }
                }
                if (count == 1) {
                    d.add((Integer) objects[i]);
                    count = 0;
                }
                if (count > 1) {
                    e.add((Integer) objects[i]);
                    count = 0;
                }
            }
            System.out.println("Distinct element: " + " " + d + "  ");
            System.out.println("Duplicate element: " + " " + e + "  ");
            // loan
        }
    }


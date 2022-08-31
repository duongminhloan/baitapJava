public class sum {
    public static void main(String [] args){
        int sum=0;
        int[] arr={1,2,3,4,5,6,7,8,9};
        for(int num: arr){
            sum = sum+num;
        }
        System.out.println("tong la: " +sum);
    }
}

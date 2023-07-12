import java.util.Scanner;

public class ReverseArray {


    public static int[] reverse(int array[]){
        int size = array.length;
        int i=0, j=size-1;
        while(i<j){
            int temp = array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }

        return array;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        array = reverse(array);
        for(int i=0;i<n;i++){
            System.out.print(array[i]+ " ");
        }
    }
}

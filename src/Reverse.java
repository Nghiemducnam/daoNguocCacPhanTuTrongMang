import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập kích thước của m ");
            size = scanner.nextInt();
            if(size >20){
                System.out.println("kích thước của mảng không quá 20 ");
            }
        } while (size >20);

        int [] arr = new int [size];
        int i = 0;
        while (i <arr.length) {
            System.out.println("xin mời nhập phần tử thứ "+ (i+1));
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.println("các phần tử bạn vừa nhập là: ");
        for( int j =0; j< arr.length; j++){
            System.out.print(arr[j] + "," );
        }
        for(int j=0; j<arr.length/2; j++){
            int temp = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 - j] = temp;
        }

        System.out.println("mảng sau khi đảo ngược là: ");
        for(int j =0; j<arr.length; j++){
            System.out.print(arr[j] + ",");
        }

    }
}

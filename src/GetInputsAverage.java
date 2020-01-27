import java.util.Scanner;

public class GetInputsAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // loop through 10 inputs
        int[] arr = new int[10];
        int i = 0;
        while (i < 10) {
            System.out.println("Enter number");
            int number = sc.nextInt();
            arr[i]+= number;
            i++;
        }
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);

        int num = 0;
        for(int j = 0; j < 10; j++) {
            num += arr[j];
        }
        int num2 = num / 10;

        System.out.println("The average is " + num2);

//        //Declare array to hold 10 inputs
//        int nums[] = new int[10];
//
//        for(int i = 0; i < 10; i++){
//            nums[i] = sc.nextInt();
//        }
//
//        int sum = 0;
//        for(int i = 0; i < 10; i++){
//            sum += nums[i];
//        }
//        System.out.println(sum);
//    }
    }
}

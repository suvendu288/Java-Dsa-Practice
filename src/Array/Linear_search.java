package Array;

import java.util.Scanner;

public class Linear_search {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter Array elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Target Element : ");
        int x = sc.nextInt();


        for(int i=0;i<n;i++){
            if (arr[i]==x)
            {
                System.out.print(" Target Element Found in Index : "+i);
                break;
            }
            }
        }


    }


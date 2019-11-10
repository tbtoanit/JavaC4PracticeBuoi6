package ExceptionPk;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int i = 10;
        int j = 1;
        float z = 1;
        int[] a = new int[3];
        Scanner sc = new Scanner(System.in);
        j= sc.nextInt();
        try{
            z = i/j;
            System.out.println(a[4]);
        } catch (ArithmeticException e){
            System.out.println("Loi chia cho 0");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Loi truy cap phan tu ngoai mang");
        }

        System.out.println(z);
    }
}

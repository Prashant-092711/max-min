package company.com;
import java.util.*;
import java.util.Scanner;

public class pattern {
public static void main(String[] args){
    Scanner B= new Scanner(System.in);
    int size = B.nextInt();
    int num[] =new int[5];
    int min;
    int max;
    Scanner A= new Scanner(System.in);
    for(int i=0;i< num.length;i++){
        num[i]=A.nextInt();
    }
    min=num[0];
    for(int i=1;i< num.length;i++)
    {
        if(num[i]<min){
            min=num[i];
        }
    }
    max=num[0];
    for(int i=1;i< num.length;i++)
    {
        if(num[i]>max){
            max=num[i];
        }
    }
    System.out.println("Smallest Element "+min);
    System.out.println("largest element "+max);
}
}

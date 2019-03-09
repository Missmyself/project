package project;
import java.util.Scanner;
public class dfsfa {

    public static void main(String[] args){
        int number,sum,a;
        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数组的大小：");
        number=in.nextInt();
        int array[]=new int[number];
        System.out.println("请输入数组的值：");
        for(i=0;i<number;i++)
        {
            array[i]=in.nextInt();
        }
        sum=array[0];
       a=array[0];
        for(i=1;i<number;i++)
        {
            if(a<0)
            {
                a=0;
            }
            a+=array[i];
            if(a>sum)
                sum=a;
            
        }
        System.out.println(sum);
    }
}

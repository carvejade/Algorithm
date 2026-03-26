import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] menu = new int[5];
        for(int i=0;i<5;i++){
            menu[i]=sc.nextInt();
        }
        int b=menu[0];
        int d=menu[3];
        for(int i=0;i<3;i++){
            if(b>menu[i])  b=menu[i];
        }
        for(int i=3;i<5;i++){
            if(d>menu[i])   d=menu[i];
        }
        System.out.println(b+d-50);
    }
}

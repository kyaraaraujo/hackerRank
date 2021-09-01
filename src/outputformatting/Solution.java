package outputformatting;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            // solução abaixo:
            System.out.printf("%-15s", s1);
            System.out.printf("%03d \n", x);
            /*
            Esse comentário é para questões de estudo, as duas linhas acima poderiam ser resumidas em uma
            System.out.printf("%-15s%03d \n", s1, x);
            */

        }
        System.out.println("================================");

    }
}

public class pattern18 {
    public static void main(String[] args) {
        for(char ch = 'A' + (5 - 1); ch >= 'A'; ch--){
            char c = ch;
            for(char j = 'A' + (5-1); j >= ch; j--){
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }
     /* 
        FOR NUMBERS

      
        for(int i=1;i<=5;i++)
        {
            int k=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(k +" ");
                k--;
            }
            System.out.println();
        }
    }
 */
}
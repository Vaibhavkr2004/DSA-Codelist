package PatternPrinting;
public class pattern9 {
    public static void main(String[] args)
    {
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= 5 - i; j++){
                System.out.print(" ");
            } 
            for(int k = 1; k <= i; k++)
            {
                System.out.print("*");
            }
            for(int l = 1; l < i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*5 - (2*i + 1); k++) {
                System.out.print("*");
            }
            for (int l = 0; l < i; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
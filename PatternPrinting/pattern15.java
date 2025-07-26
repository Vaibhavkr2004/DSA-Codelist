public class pattern15 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            // for(char ch = 'A';  ch <= 'A' + (5 - i - 1); ch++){
            //     System.out.print(ch + " ");
            // }
            char ch ='A';
            for(int j=1;j<=(5-i+1);j++)
            { 
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

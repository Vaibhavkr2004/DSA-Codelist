public class pattern5 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        for(int i = 1; i <= 5; i++){
            for(int j = 0; j <= (5-i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

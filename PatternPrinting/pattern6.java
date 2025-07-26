public class pattern6 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        for(int i = 1; i <= 5; i++){
            for(int j = 0; j <= (4-i+1); j++){
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
}

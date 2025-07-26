public class pattern22 {
    public static void main(String[] args) {
        int n=4;
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <= 7; j++){
                if(i==1 || j==1 || j==7){
                    System.out.print(n);
                }
                else if(i==2 || j==2 || j==6){
                    System.out.print(3);
                }
                    else if(i==3 || j==3 || j==5){
                    System.out.print(2);
                }
                    else if(i==4 || j==4){
                    System.out.print(1);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

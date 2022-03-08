import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String arr[][] = new String[n][n];


        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(i== j ||  i == n-j-1 || i== n/2 || j== n/2){
                    arr[i][j] = "*";
                }
                else {
                    arr[i][j] = ".";
                }

            }
        }

        for (int k = 0; k < n ; k++) {
            for (int c = 0; c < n ; c++) {
                System.out.print(arr[k][c] + " ");
            }
            System.out.println();

        }
    }
}
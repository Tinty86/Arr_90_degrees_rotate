import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte N_len = sc.nextByte();
        byte M_len = sc.nextByte();
        int[][] input_matrix = new int[N_len][M_len];
        for (int i = 0; i < N_len; i++) {
            for (int j = 0; j < M_len; j++) {
                input_matrix[i][j] = sc.nextInt();
            }
        }
        int[][] output_matrix = new int[M_len][N_len];
        int inv_i = N_len - 1;
        for (int i = 0; i < input_matrix.length; i++) {
            for (int j = 0; j < input_matrix[i].length; j++) {
                output_matrix[j][inv_i] = input_matrix[i][j];

            }
            inv_i--;
        }
        System.out.println(M_len + " " + N_len);
        for (int i = 0; i < output_matrix.length; i++) {
            for (int j = 0; j < output_matrix[i].length; j++) {
                System.out.print(output_matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//package SamplePrograms;
//
//import java.util.Scanner;
//
//public class SpiralPrint {
//    public static void main(String[] args) {
//    	 Scanner
//    	 scanner = new Scanner(System.in);
//         System.out.print("Enter the size of the matrix (n): ");
//         int n = scanner.nextInt();
//         int[][] matrix = new int[n][n];
//
//         // Input matrix elements
//         System.out.println("Enter the matrix elements:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 matrix[i][j] = scanner.nextInt();
//             }
//         }
//
//         int num = 0;
//
//         int top = 0, bottom = n - 1, left = 0, right = n - 1;
//
//        while (num <= n * n) {
//            // Traverse from left to right
//            for (int i = 0; i <= right; i++) { //right =n-1
//                System.out.print(matrix[top][i] + " ");
//                num++;
//            }
//            top++;
//
//            // Traverse from top to bottom
//            for (int i = top; i <= bottom; i++) {  //bottom =n-1
//                System.out.print(matrix[i][right] + " ");
//                num++;
//            }
//            right--;
//
//            // Traverse from right to left 
//            for (int i = right; i >= left; i--) {
//                System.out.print(matrix[bottom][i] + " ");
//                num++;
//            }
//            bottom--;
//
//            // Traverse from bottom to top
//            for (int i = bottom; i >= top; i--) {
//                System.out.print(matrix[i][left] + " ");
//                num++;
//            }
//           left++;
//        }
//    }
//}
package Little_Complex;



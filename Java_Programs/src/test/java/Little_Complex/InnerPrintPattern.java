package Little_Complex;

public class InnerPrintPattern {
	
	    public static void main(String[] args) {
	        int n = 4; // Change this to the desired number of rows

	        for (int i = 0; i < 2 * n - 1; i++) {
	            for (int j = 0; j < 2 * n - 1; j++) {
	                int num;
	                if (i < n) {
	                    if (j < n) {
	                        num = n - i;
	                    } else {
	                        num = n - j;
	                    }
	                } else {
	                    if (j < n) {
	                        num = i - n + 2;
	                    } else {
	                        num = j - n + 2;
	                    }
	                }
	                System.out.print(num);
	            }
	            System.out.println();
	        }
	    }
	}

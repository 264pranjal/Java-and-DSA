/*
For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print in the order followed for every iteration:
a. First row(left to right)
b. Last column(top to bottom)
c. Last row(right to left)
d. First column(bottom to top)
 Mind that every element will be printed only once.
Refer to the Image:
![image](https://user-images.githubusercontent.com/37728750/166112673-ed7e0844-2bf3-4d57-a83e-818c1092cf34.png)

Spiral path of a matrix

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

Second line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith row constitutes 'M' column values separated by a single space.
Output format :
For each test case, print the elements of the two-dimensional array/list in the spiral form in a single line, separated by a single space.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1sec
Sample Input 1:
1
4 4 
1 2 3 4 
5 6 7 8 
9 10 11 12 
13 14 15 16
Sample Output 1:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
Sample Input 2:
2
3 3 
1 2 3 
4 5 6 
7 8 9
3 1
10
20
30
Sample Output 2:
1 2 3 6 9 8 7 4 5 
10 20 30 
*/
public class Solution {

	public static void spiralPrint(int matrix[][]){
        if(matrix.length==0){
            return;
        }
		int rs=0,cs=0,re=matrix.length-1,ce=matrix[0].length-1;
        int count=0;
        int n=matrix.length*matrix[0].length;
        while(count!=n){
            for(int i=cs;i<=ce;i++){
                System.out.print(matrix[rs][i]+" ");
                count++;
            }
            rs++;
            for(int i=rs;i<=re;i++){
                System.out.print(matrix[i][ce]+" ");
                count++;
            }
            ce--;
            for(int i=ce;i>=cs;i--){
                System.out.print(matrix[re][i]+" ");
                count++;
            }
            re--;
            for(int i=re;i>=rs;i--){
                System.out.print(matrix[i][cs]+" ");
                count++;
            }
            cs++;
        }
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[][] take2DInput() throws IOException {
        String[] strRowsCols = br.readLine().trim().split("\\s");
        int n_rows = Integer.parseInt(strRowsCols[0]);
        int m_cols = Integer.parseInt(strRowsCols[1]);

        if (n_rows == 0) {
            return new int[0][0];
        }


        int[][] mat = new int[n_rows][m_cols];

        for (int row = 0; row < n_rows; row++) {
            String[] strNums; 
            strNums = br.readLine().trim().split("\\s");
            
            for (int col = 0; col < m_cols; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }

        return mat;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[][] mat = take2DInput();

            Solution.spiralPrint(mat);
            System.out.println();

            t -= 1;
        }
    }
}

package medium;
/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
For example,

Consider the following matrix:

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
Given target = 5, return true.

Given target = 20, return false.
 * @author JieXu
 *
 */
// time:
// worst case eg:18, it will take o(c+r) time,every row and col will be traversed
public class Searcha2DMatrixII {
	public static boolean searchMatrix(int[][] matrix, int target) {
      if(matrix.length==0||matrix[0][0]>target||matrix[matrix.length-1][matrix[0].length-1]<target){
    	  return false;
      }
      int row = 0;
      int col = matrix[0].length-1;
      while(row<matrix.length && col>=0){
    	  if(target==matrix[row][col]) return true;
    	  else if(target<matrix[row][col]) col--;
    	  else row++;
      }
      return false;
    }
	public static void main(String[]args){
		int[][] mtx = {
				  {1,   4,  7, 11, 15},
				  {2,   5,  8, 12, 19},
				  {3,   6,  9, 16, 22},
				  {10, 13, 14, 17, 24},
				  {18, 21, 23, 26, 30}};
		System.out.println(searchMatrix(mtx,4));
	}
}

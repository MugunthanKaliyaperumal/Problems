package com.mugunthan.DynamicProgramming;

public class UniquePaths2 {

	public static void main(String[] args) {
		int[][] obstacleGrid = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		UniquePaths2Solution ob = new UniquePaths2Solution();
		int uniquePathsWithObstacles = ob.uniquePathsWithObstacles(obstacleGrid);
		System.out.println(uniquePathsWithObstacles);
	}

}

class UniquePaths2Solution {

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int row = obstacleGrid.length;
		int column = obstacleGrid[0].length;
		int[][] noOfPaths = new int[row][column];
		boolean flag = true;
		for (int j = 0; j < column; j++) {
			if (obstacleGrid[0][j] == 0 && flag == true) {
				noOfPaths[0][j] = 1;
			} else {
				flag = false;
				noOfPaths[0][j] = 0;
			}
		}
		flag = true;
		for (int i = 0; i < row; i++) {
			if (obstacleGrid[i][0] == 0 && flag == true) {
				noOfPaths[i][0] = 1;
			} else {
				flag = false;
				noOfPaths[i][0] = 0;
			}
		}
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < column; j++) {
				if (obstacleGrid[i][j] != 1) {
					noOfPaths[i][j] = noOfPaths[i - 1][j] + noOfPaths[i][j - 1];
				} else {
					noOfPaths[i][j] = 0;
				}
			}
		}
		return noOfPaths[row - 1][column - 1];
	}
}
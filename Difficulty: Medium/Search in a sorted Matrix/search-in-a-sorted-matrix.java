class Solution {
	public boolean searchMatrix(int[][] mat, int x) {
		// code here
		int n = mat.length;
		int m = mat[0].length;
		int arr[] = new int[n*m];
		int k = 0;
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<m; j++) {
				arr[k] = mat[i][j];
				k++;
			}
		}
		int low = 0;
		int high = n*m - 1;
		while (low <= high) {
			int mid = low + (high - low)/2;
			if (arr[mid] == x) {
				return true;
			}
			else if (arr[mid]>x) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return false;
	}
}

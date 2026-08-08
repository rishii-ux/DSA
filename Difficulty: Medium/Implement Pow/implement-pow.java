class Solution {
	double power(double b, int e) {
		// code here
		double ans = 1.0;
		long  BinaryForm = e; 
		if (BinaryForm < 0) {
            b = 1 / b;
            BinaryForm = -BinaryForm;
        }
		while (BinaryForm>0) {
			if (BinaryForm%2 == 1) {
				ans = ans*b;
			}
			b=b*b;
			BinaryForm = BinaryForm/2;
		}
		return ans;
	}
}

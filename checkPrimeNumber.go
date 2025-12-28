class checkPrimeNumber{
     public static void main(String[] args) {
	   int number=6;
	   System.out.print(checkNumber(number));
	 }
	private static boolean checkNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

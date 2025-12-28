class AllrangePrimeNumber{
	   public static void main(String[] args) {
	   int start=1;
	   int end=10;
	   for(int i=start;i<=end;i++){
		   if(checkNumber(i)){
		   	   System.out.print(i+" ");
	     }
	   }
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

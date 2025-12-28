class Perfectumber {
	  public static void main(String[] args) {
		  int num=15;
		 System.out.println(isPerfect(num));
	  }
    static boolean isPerfect(int n) {
        if(n<=1) return false;
        int sum=1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                sum=sum+i;
                if(i!=n/i){
                    sum+=n/i;
                }
            }
        }
        if(sum==n){
            return true;
        }
        else{
            return false;
        }
    }
}
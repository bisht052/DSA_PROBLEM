class FirstNFibonacci {
     public static void main(String[] args) {
       int a=0;
	   int b=1;
	   int n=7;
	   for(int i=0;i<n;i++){
		   System.out.print(a+" ");
		   int c=a+b;
		   a=b;
		   b=c;
}
	 }
}
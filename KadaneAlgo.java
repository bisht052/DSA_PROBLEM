class KadaneAlgo{
	public static void main(String [] args) {
		int arr[]={-2, -5, 6, -2, -3, 1, 5, -6};
		 int result=longestMaximuSubArr(arr);
		 System.out.println("Result is "+result);
		}
		 static int longestMaximuSubArr(int [] arr) {
			   int len=arr.length;
			  int maximumsum= arr[0];
			  int currentSum= arr[0]; 
			  for(int i=1;i<len;i++ ) {
				  if(currentSum>=0){
					  currentSum=currentSum+arr[i];
				  }
				  else if(currentSum<0){
					  currentSum=arr[i];
				  }
				  maximumsum=Math.max(maximumsum,currentSum);
			  }
			  return maximumsum;
 }
}
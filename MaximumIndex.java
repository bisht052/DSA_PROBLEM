class MaximumIndex{
		public static void main(String [] args) {
		int arr[]={34, 8, 10, 3, 2, 80, 30, 33, 1};
		 int index=MaximuIindex(arr);
		 System.out.println("Max Index is "+index);
		}
		 static int MaximuIindex(int [] arr) {
			   int len=arr.length;
			  int max= 0;
			  for(int i=1;i<len;i++ ) {
				  for(int j=len-1;j>i;--j){
					  if(arr[i]<=arr[j]){
						  int temp =j-i;
						  max=Math.max(temp,max);
						  break;
					  }
				  }
 }
 			  return max;

}
}
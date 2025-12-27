class MaxConsecutiveOnes{
	
	public static void main(String[] args) {

        int arr[] = {1,1,0,1,1,1,0,0,1,1,1,1,1};
		int maxCons=MaxConsecutiveOnes(arr);
		 System.out.println(maxCons);
		
	}
	
	static int MaxConsecutiveOnes(int arr[]){
		int left=0;
		int currentWindow=0;
		int ans=-1;
		for(int right=0;right<arr.length;right++){
			currentWindow=currentWindow+arr[right];
			while(right-left+1!=currentWindow){
				currentWindow=currentWindow-arr[left];
				left++;
		}
		ans=Math.max(ans,right-left+1);
}
	return ans;

	}
}

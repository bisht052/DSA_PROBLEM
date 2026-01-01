class IndexesofSubarraySum{
			public static void main(String[] args) {
				int [] arr={1, 2, 3, 7, 5};
				int target = 12;
				int res[]=ofSubarraySum(arr,target);
				System.out.println(res[0] +","+res[1]);
			}
			static int [] ofSubarraySum(int [] arr,int target){
				int sum=0;
				int start=0;
				for(int end=0;end<arr.length;end++){
					  sum=sum+arr[end];
					  while(sum>target && start<=end){
						  sum=sum-arr[start];
						  start++;
					  }
					      if(sum==target){
						return new int[]{start+1,end+1};
                  }
				  
				}
                return new int[]{-1,-1};
            }
        }
			


class MoveZerov2{
	public static void main(String [] args) {
		int arr[]={1,0,0,5,0,9};
		 moveZeroToEnd(arr);
		     for(int i=0;i<arr.length;i++){
			 System.out.print(arr[i]+" ");
			 System.out.println("Local change");
			  System.out.println("Remote change");
		}
	}
		 static void  moveZeroToEnd(int [] arr) {
			   int len=arr.length;
			   int i=0;
			   int j=1;
			   while(j<len){
				   if(arr[i]==0 && arr[j]!=0){
					   int temp=arr[j];
					   arr[j]=arr[i];
					   arr[i]=temp;
					   i++;
					   j++;
			   }else if(arr[i]==0 && arr[j]==0){
				   j++;
			   } else if(arr[i]!=0 && arr[j]==0){
				   i++;
				   j++;	   
			   }		
			
 }
		 }
		
}

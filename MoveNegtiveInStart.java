class MoveNegtiveInStart{
	public static void main(String [] args) {
		int arr[]={30,-20,50,95,-90,9};
		 MoveNegtiveInStart(arr);
		     for(int i=0;i<arr.length;i++){
			 System.out.print(arr[i]+" ");
		}
	}
		 static void  MoveNegtiveInStart(int [] arr) {
			   int len=arr.length;
			   int i=0;
			   int j=1;
			   while(j<len){
				   if(arr[i]>=0 && arr[j]<0){
					   int temp=arr[j];
					   arr[j]=arr[i];
					   arr[i]=temp;
					   i++;
					   j++;
			   }else if(arr[i]<0 && arr[j]<0){
				   j++;
			   } else if(arr[i]<0 && arr[j]>0){
				   i++;
				   j++;	   
			   }	else {   // arr[i] >= 0 && arr[j] >= 0
                j++;
           }
	
			
 }
		 }
		
}
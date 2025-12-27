class FindAnsMissNumber{
public static void main(String [] args) {
		int arr[]={1,3,2,4,5,5,6};
		 int []num=FindAndMissNum(arr);
		 System.out.println("Repeat number is "+ num[0] + " Miss num "+num[1]);
		}
		static int []FindAndMissNum(int []arr){
			int len=arr.length;
			int []checkedArr=new int[len+1];
			int []res= new int[2];
			for(int i=0;i<len;i++){
				if(checkedArr[arr[i]]==0){
					checkedArr[arr[i]]=1;
				}else if(checkedArr[arr[i]]==1){
					res[0]=arr[i];
				}
			}
		 for(int i=1;i<checkedArr.length;i++){
			 if(checkedArr[i]==0){
				 res[1]=i;
			  } 
			}
			return res;
		}
}
class MaxconsecutiveNONZEROelements{

public static void main(String[] args) {

        int arr[] = {12,12,0,12,12,12,0,0,12,12,12,12,12,12,12};
		int max =0;
		int count=0;
		
		for(int num:arr){
			if(num!=0){
				count++;
				max=Math.max(count,max);
			}else{
				count=0;
			}		
}
System.out.println("Count Of MaxconsecutiveNONZEROelements----> "+max);
}
}
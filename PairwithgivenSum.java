import java.util.HashMap;
class PairwithgivenSum{
			public static void main(String[] args) {
				int [] arr={0, -1, 2, -3, 1};
				int target = -2;
				System.out.println(PairwithgivenSum(arr,target));
				//System.out.println(res[0] +","+res[1]);
			}
			//static int [] PairwithgivenSum(int [] arr,int target){
				static boolean PairwithgivenSum(int [] arr,int target){
				HashMap<Integer,Boolean> map=new HashMap<> ();
				for(int i=0;i<arr.length;i++){
					int complement=target-arr[i];
					if(map.containsKey(complement)){   
						//return new int[]{complement,arr[i]};
						return true;
					}
				//	map.put(arr[i],i);
				map.put(arr[i],true);

				}
			//	return new int []{};
			return false;
        }
			}

class SquareRoot {
    public static void main(String [] args){
        int num=100;
        int res=floorSqrt(num);
        System.out.println(res);
        
    }
    static int floorSqrt(int n) {
        int ans=0;
        for(int i=1;i*i<=n;i++){
            ans=i;
        }
        return ans;
    }
}
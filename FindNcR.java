class FindNcR {
    public static void main(String [] args){
        int num=5,r=0;
        int result=nCr(num,r);
        System.out.println(result);
    }
    public  static int nCr(int n, int r) {
     if(r>n) return 0;
     if(r>n/2){
         r=n-r;
     }
     long ans=1;
     for(int i=0;i<r;i++){
         ans=ans*(n-i)/(i+1);
     }
     return (int)ans;
    }
}
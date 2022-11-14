class FindDuplicates {
    public static void main(String[] args) {
        int[] arr={1,9,9,8,4,3,5,2,1,10,12};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
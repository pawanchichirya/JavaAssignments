class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,8,1,2,78,99,45,66,10};
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        for(int el: arr)
            System.out.print(el+" ");
    }
}

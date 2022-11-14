class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,8,1,2,78,99,45,66,10};
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            int last=n-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
        for(int el: arr)
            System.out.print(el+" ");
    }
        static void swap(int[] arr, int x, int y){
            int temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
        }
        
        static int getMaxIndex(int[] arr,int start,int end){
            int max=start;
            for(int i=start;i<=end;i++){
                if(arr[max]<arr[i])
                    max=i;
            }
            return max;
        }
    }


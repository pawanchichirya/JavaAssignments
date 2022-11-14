class QuickSort {
    public static void main(String[] args) {
        int[] arr={5,8,1,2,78,99,45,66,10};
        int n=arr.length;
        quickSort(arr,0,n-1);
        for(int el: arr)
            System.out.print(el+" ");
    }
    
    static void quickSort(int[] arr, int s, int e){
        if(s>=e)
            return;
        
        int p=partition(arr,s,e);
        quickSort(arr,s,p-1);
        quickSort(arr,p+1,e);
    }
    
    static int partition(int[] arr, int s, int e){
        int pivot=arr[s];
        int count=0;
        for(int i=s+1;i<=e;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pIndex=s+count;
        int temp=pivot;
        arr[s]=arr[pIndex];
        arr[pIndex]=temp;
        
        int i=s,j=e;
        while(i<pIndex && j>pIndex){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<pIndex && j>pIndex){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
                i++;
                j--;
            }
        }
        return pIndex;
    }
}
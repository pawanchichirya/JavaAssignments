class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,8,1,2,78,99,45,66,10};
        int n=arr.length;

        mergeSort(arr,0,n-1);
        for(int ele:arr)
            System.out.print(ele+" ");
    }

    static void mergeSort(int[] arr,int s,int e){
        if(s>=e)
            return;

        int mid =(s+e)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);
        merge(arr,s,e);
    }

    static void merge(int[] arr,int s,int e){
        int mid =(s+e)/2;
        int n1=mid-s+1;
        int n2=e-mid;
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];

        int index =s;
        for(int i=0;i<n1;i++){
            arr1[i]=arr[index++];
        }

        for(int i=0;i<n2;i++){
            arr2[i]=arr[index++];
        }
        index=s;
        int idx1=0;
        int idx2=0;
        
        while(idx1<n1 && idx2<n2){
            if(arr1[idx1]<arr2[idx2]){
                arr[index++]=arr1[idx1++];
            }
            else {
                arr[index++]=arr2[idx2++];
            }
        }
        while(idx1<n1){
            arr[index++]=arr1[idx1++];
        }
        while(idx2<n2){
            arr[index++]=arr2[idx2++];
        }
    }
}
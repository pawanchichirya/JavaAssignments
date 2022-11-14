class Subset {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={1,4,12};
        int m=arr1.length;
        int n=arr2.length;
        int i=0;
        int j=0;
        boolean flag=true;
        
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(arr2[i]==arr1[j])
                    break;
            }
            if(j==m)
                flag=false;
        }
        if(flag==true){
            System.out.println("Subset");
        } else{
            System.out.println("Not a Subset");
        }
    }
}


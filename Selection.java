public class Selection {
    public static void selection(int arr[]){
        for(int i = 0;i<arr.length;i++){
            int minPos = i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                } 
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void print(int arr[]){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,6,4,9,7};

        selection(arr);
        print(arr);
    }
}

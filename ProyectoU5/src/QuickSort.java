public class QuickSort extends Sorteds{

    @Override
    public void sorted() {
        quickSort(arr, 0, arr.length-1);
    }


    public void quickSort(int[] arr, int left, int right){
        if(right <= left) return;
        int pivot = partition(arr, left, right);
        quickSort(arr, left, pivot-1);
        quickSort(arr, pivot+1, right);
    }

    public int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int index = left-1;
        for(int i = left; i <= right; i++){
            if(arr[i] < pivot){
                index++;
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        index++;
        int temp = arr[index];
        arr[index] = arr[right];
        arr[right] = temp;
        return index;
    }
    
}

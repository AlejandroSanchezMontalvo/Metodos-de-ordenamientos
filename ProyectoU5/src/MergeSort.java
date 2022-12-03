public class MergeSort extends Sorteds{

    @Override
    public void sorted() {
        mergeSort(arr);
    }

    public void mergeSort(int[] arr){
        int n = arr.length;
        if(n <= 1) return;
        int middle = n / 2;
        int[] leftArr = new int[middle];
        int[] rightArr = new int[n - middle];
        int left = 0;
        int right = 0;
        for(; left < n; left++){
            if(left < middle){
                leftArr[left] = arr[left];
            }else{
                rightArr[right] = arr[left];
                right++;
            }
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, rightArr, arr);
    }

    public void merge(int[] leftArr, int[] rightArr, int[] arr){
        int lSize = arr.length / 2;
        int rSize = arr.length - lSize;
        int i = 0, left = 0, right = 0;
        while(left < lSize && right < rSize){
            if(leftArr[left] < rightArr[right]){
                arr[i] = leftArr[left];
                left++;
            }else{
                arr[i] = rightArr[right];
                right++;
            }
            i++;
        }
        while(left < lSize){
            arr[i] = leftArr[left];
            i++;
            left++;
        }
        while(right < rSize){
            arr[i] = rightArr[right];
            i++;
            right++;
        }
    }
    
}

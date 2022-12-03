public class Radix extends Sorteds{

    @Override
    public void sorted() {
        radix(arr, arr.length);
    }

    public void radix(int[] arr, int size){
        int max = max(arr, size); 
        for (int place = 1; max / place > 0; place *= 10){
            countingSort(arr, size, place);
        }
    }
    public int max(int[] array, int n){
        int max = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
    public void countingSort(int[] array, int size, int place){
        int[] output = new int[size + 1];
        int max = array[0];
        for (int i = 1; i < size; i++) {
          if (array[i] > max)
            max = array[i];
        }
        int[] count = new int[max + 1];
    
        for (int i = 0; i < max; ++i)
          count[i] = 0;
    
        for (int i = 0; i < size; i++)
          count[(array[i] / place) % 10]++;
    
        for (int i = 1; i < 10; i++)
          count[i] += count[i - 1];
    
        for (int i = size - 1; i >= 0; i--) {
          output[count[(array[i] / place) % 10] - 1] = array[i];
          count[(array[i] / place) % 10]--;
        }
    
        for (int i = 0; i < size; i++)
          array[i] = output[i];
      }
    }

    

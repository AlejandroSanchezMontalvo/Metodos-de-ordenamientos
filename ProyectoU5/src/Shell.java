public class Shell extends Sorteds {

    @Override
    public void sorted() {
        shell(arr);
    }


    public void shell(int[] arr){
        int jump = arr.length/2;
        int lock = 0;

        while(jump > 0){

            for(int i = 0; i < arr.length-jump; i++){
                if(arr[i] > arr[i+jump]){
                    int temp = arr[i];
                    arr[i] = arr[i+jump];
                    arr[i+jump] = temp;
                    lock++;
                }
            }
            if(lock == 0) jump = jump/2;
            lock = 0;

        }

    }
    
}

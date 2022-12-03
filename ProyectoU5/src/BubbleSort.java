public class BubbleSort extends Sorteds {

    @Override
    public void sorted() {
        bubbleSort(arr);
    }


    public void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                // comparamos en pares, y si el elemento de la izquierda es mayor intercambiamos.
                // de esta manera el elemento mayor quedara hasta el final en cada vuelta
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

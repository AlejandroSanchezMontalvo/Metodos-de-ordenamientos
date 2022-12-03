import java.util.Scanner;

public class Intercalacion {

    Scanner sc = new Scanner(System.in);
    BubbleSort bubleSort = new BubbleSort();
    Lista lista1 = new Lista();
    Lista lista2 = new Lista();
    Lista lista3 = new Lista(); 
    int[] arr1;
    int[] arr2;
    int[] result;

    public void intercalacion(int[] arr1, int[] arr2, int[] result){
        // ordenamos los dos array para luego funcionarlo en el tercero
        bubleSort.bubbleSort(arr1);
        bubleSort.bubbleSort(arr2);
        int i = 0, j = 0, k = 0;
        for(k = 0; i < arr1.length && j < arr2.length; k++){
            // si es menor guardamos ese elemento en el array resultante y avanzamos un indice del arreglo1
            if(arr1[i] < arr2[j]){
                result[k] = arr1[i];
                i++;
            }else{
                // en caso contrario guardamos el valor del arr2 y avanzamos un indice del arreglo2
                result[k] = arr2[j];
                j++;
            }
        }
        // Puede suceder que un arreglo sea menor que otro,asi que faltaron elementos en agrega al array resultante
        // guardamos elementos sobrantes del arr1
        for(; i < arr1.length; i++){
            result[k] = arr1[i];
            k++;
        }
        // guardamos elementos sobrantes del arr2
        for(; j < arr2.length; j++){
            result[k] = arr2[j];
            k++;
        }
        
    }

    public void menu(){
        int opt = 0;
        do {
            System.out.println("\n1.agregar elemento a la lista1 2.agregar elemento a la lista2 3.eliminar elemento de la lista1 4.eliminar elemento de la lista2 5.ordenar 6.mostrar 7.salir");
            opt = sc.nextInt();
            if(opt == 7) return;
            if(opt == 1) add(lista1);
            if(opt == 2) add(lista2);
            if(opt == 3) delete(lista1);
            if(opt == 4) delete(lista2);
            if(opt == 5){
                arr1 = new int[lista1.size];
                arr2 = new int[lista2.size];
                result = new int[lista1.size + lista2.size];
                lista1.toArr(arr1);
                lista2.toArr(arr2);
                intercalacion(arr1, arr2, result);
                lista1.toList(arr1);
                lista2.toList(arr2);
                lista3.toList(result);   
            }
            if(opt == 6){
                lista1.peek();
                System.out.println(" ");
                lista2.peek();
                System.out.println(" ");
                lista3.peek();
            }


        }while(true);
    }

    public void add(Lista lista){
        int valor;
        System.out.print("valor: ");
        valor = sc.nextInt();
        lista.add(valor);
        lista3.add(valor);
    }
    public void delete(Lista lista){
        int valor;
        System.out.print("valor a eliminar: ");
        valor = sc.nextInt();
        lista.pop(valor);
        lista3.pop(valor);
    }

    
}

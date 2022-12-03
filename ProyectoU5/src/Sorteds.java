import java.util.Scanner;

public class Sorteds {
    
    Scanner sc = new Scanner(System.in);
    Lista lista = new Lista();
    int[] arr;

    public void menu(){
        int opt = 0;
        do {
            System.out.println("\n1.agregar elemento 2.eliminar elemento 3.ordenar 4.mostrar 5.salir");
            opt = sc.nextInt();
            if(opt == 5) return;
            if(opt == 1) add(lista);
            if(opt == 2) delete(lista);
            if(opt == 3){
                lista.toArr(arr);
                sorted();
                lista.toList(arr);
            }
            if(opt == 4) lista.peek();

        }while(true);
    }

    public void sorted(){};
    public void add(Lista lista){
        int valor;
        System.out.print("valor: ");
        valor = sc.nextInt();
        lista.add(valor);
        arr = new int[lista.size];
    }
    public void delete(Lista lista){
        int valor;
        System.out.print("valor a eliminar: ");
        valor = sc.nextInt();
        lista.pop(valor);
        arr = new int[lista.size];
    }

}

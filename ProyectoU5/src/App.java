import java.util.HashMap;
import java.util.Scanner;

public class App {
    static BubbleSort bubble = new BubbleSort();
    static QuickSort quick = new QuickSort();
    static MergeSort merge = new MergeSort();
    static MergeSortNatural naturalMerge = new MergeSortNatural();
    static Shell shell = new Shell();
    static Radix radix = new Radix();
    static Intercalacion intercalacion = new Intercalacion();
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        HashMap<Integer, String> opts = new HashMap<>();
        opts.put(1, "burbuja");
        opts.put(2, "QuickSort");
        opts.put(3, "Mezcla directa");
        opts.put(4, "Mezcla natural");
        opts.put(5, "shell");
        opts.put(6, "raidx");
        opts.put(7, "intercalacion");
        int opt;
        do {
            System.out.println("-----------------------------");
            System.out.println("1.Burbuja 2.QuickSort 3.Mezcla directa 4.Mezcla natural 5.shell 6.radix 7.Intercalacion 0.Salir");
            opt = sc.nextInt();
            System.out.println("Selecciono Metodo " + opts.get(opt));
            if(opt == 0) return;
            if(opt == 1) bubble.menu();
            if(opt == 2) quick.menu();
            if(opt == 3) merge.menu();
            if(opt == 4) naturalMerge.menu();
            if(opt == 5) shell.menu();
            if(opt == 6) radix.menu();
            if(opt == 7) intercalacion.menu();
         
        }while(true);
        

    }
}



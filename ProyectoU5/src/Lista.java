public class Lista {
    class Nodo{
        int value;
        Nodo next;
        public Nodo(int value){
            this.value = value;
            this.next = null;
        }
    }
    Nodo head;
    Nodo tail;
    int size;
    public Lista(){
        head = null;
        tail = null;
        size = 0;
    }
    public void add(int val){
        Nodo newNodo = new Nodo(val);
        if(head == null){
            head = newNodo;
            tail = newNodo;
        }else{
            tail.next = newNodo;
            tail = tail.next;
        }
        size++;
    }
    public void peek(){
        Nodo temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
    public boolean search(int ele){
        Nodo temp = head;
        while(temp != null){
            if(temp.value == ele) return true;
            temp = temp.next;
        }
        return false;
    }
    public void pop(int ele){
        if(search(ele)){
            Nodo temp = head;
        if(temp.value == ele){
            head = head.next;
            return;
        }
        while(temp.next.value != ele){
            temp = temp.next;
        }
        if(tail.value == ele){
            tail = temp;
            tail.next = null;
        }else{
            temp.next = temp.next.next;
        }
        size--;
        }else{
            System.out.println("elemento no encontrado");
        }
        
    }
    public void toArr(int[] arr){
        Nodo aux = head;
        for(int i = 0; aux != null; i++){
            arr[i] = aux.value;
            aux = aux.next;
        }
    }
    public void toList(int[] arr){
        Nodo aux = head;
        for(int i = 0; aux != null; i++){
            aux.value = arr[i];
            aux = aux.next;
        }
    }
    
}

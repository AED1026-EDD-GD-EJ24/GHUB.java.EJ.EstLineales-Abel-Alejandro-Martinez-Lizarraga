package miPrincipal;

public class Pila<T>{
    //Apunta al tope de la pila
    private  Nodo<T> cabeza;
    //Almacena el total de elementos d ela pila
    private int tamanio;
    public Pila(){
        cabeza=null;
        tamanio =0;
    }

    //get
    public int getTamanio() { return this.tamanio;}
    public int getValor() {return cabeza.getDato();}


    //Veirfica si la pila esta vacia
    public boolean esVacia(){
        return cabeza==null;
    }

    public void apilar(T valor){
        //Crea un nuevo nodo
        Nodo<T> nuevoNodo = new Nodo<>(valor);
        //fijar valor en el nodo
        nuevo.setValor(5);
        if (esVacia()) {
            //Cabeza apunta al nuevo nodo
            cabeza = nuevo;
        } else {
            //se enlaza el campo sigueite de nuevo con la cabeza
            nuevo.setSiguiente(cabeza);
            //la nueva canbeza se la pila pasa ser neuevo
            cabeza = nuevo;
        }
        //Invrementar el tamanio por que hay un nuevo elmento en la pila
        tamanio++;

    }

    public void desapilar(){
        if (!esVacia()) {
            //la cabeza de la pila pasa a ser el siguiente nodo
            cabeza = cabeza.getSiguiente();
            tamanio--;
        }
        
        
    }   
    //Devuelce el elemento almacenado en el tope de la cima
    public T cima(){
        if (!esVacia()) {
            return cabeza.getValor();
        }else
        return null;
    }


}
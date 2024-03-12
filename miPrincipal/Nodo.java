package miPrincipal;
ala
public class Nodo<T>{
    //Almacena la referencia que se guarda en el nodo
    private T valor;
    //Hace referencia al siguiente  nodo enlazazo
    private Nodo<T> siguiente;
    

    public Nodo(T valor){
        this.valor = valor;
        this.siguiente = null;
    }


    //Metodos get y set
    public T getValor() {   
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }   

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}

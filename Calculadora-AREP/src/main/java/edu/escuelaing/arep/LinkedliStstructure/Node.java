package edu.escuelaing.arep.LinkedliStstructure;

/**
 * Esta clase genera los nodos de la linked list
 * @author Paula Andrea Guevara Sánchez
 * @param <E> parametro de tipo generico
 */
public class Node<E>{
    private E data;
    private Node<E> next;

    /**
     * Método constructor que toma el valor (data) del nodo como valor
     * @param data es el valor del nodo
     */
    public Node(E data) {
        this.data = data;
        this.next = null;
    }

    /***
     * Método para obtener el valor del nodo
     * @return el valor del nodo (data)
     */
    public E getData() {
        return data;
    }

    /***
     * Método para obtener el valor del siguiente nodo
     * @return el nodo siguiente
     */

    public Node<E> getNext() {
        return next;
    }

    /***
     * Métpdp para establecer el valor del nodo
     * @param data valor del nuevo nodo
     */
      public void setData(E data) {
        this.data = data;
    }

    /**
     * Métpdp para establecer el valor del siguiente nodo
     * @param next valor del siguiente nodo
     */
    public void setNext(Node<E> next) {
        this.next = next;
    }


}

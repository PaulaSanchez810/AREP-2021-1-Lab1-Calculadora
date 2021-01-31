package edu.escuelaing.arep.LinkedliStstructure;

import java.util.Iterator;

/**
 *Esta clase genera una Linked list
 * @author Paula Andrea Guevara Sánchez
 * @param <E> tipo de paramero generico
 */

public class LinkedList<E> implements Iterable<E>{
    private Node<E> head ;
    private Node<E> tail;
    private int size;

    /**
     * Método constructor de la Linked List con una lista como parametro
     * @param doubles lista de datos
     */
    public LinkedList(E[] doubles){
        this.head=null;
        this.tail=null;
        this.size=0;
        for (E i:doubles) {
            this.insertLast(i);
        }
    }

    /**
     * Método constructor de la Linked List sin parametros
     */
    public LinkedList() {
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    /**
     * Método para agregar un nodo en la primera posición
     * @param data valor del nodo
     */
    public void insertFirst(E data){
        Node<E> node;
        node = new Node<E>(data);
        node.setData(data);
        head = node;
        size++;
    }

    /**
     * Método para agregar un nodo en la ulrima posición
     * @param data valor del ultimo nodo
     */

    public void insertLast(E data){
        Node<E> newTail = new Node<E>(data);
        if (this.size == 0){
            this.head=newTail;
            this.tail=newTail;
        }
        else{
            tail.setNext(newTail);
            tail = newTail;
        }
        size++;
    }

    /**
     * Método para obtener el tamaño de la lista
     * @return el tamaño de la lista de typo entero
     */
    public int getSize() {
        return size;
    }

    /**
     * Método que valida si la lista esta vacia
     * @return valor de typo boolean
     */
    public boolean emptyList(){
        return head == null;
    }

    /**
     * Método que remueve el valor del primer nodo (head), si la lista no esta vacia.
     * @throws NoSuchFieldException genera un Excepción si la lista esta vacía
     */
    public void removeFirst() throws NoSuchFieldException {
        if (head!=null){
            Node<E> first = head.getNext();
            head = head.getNext();
            first.setNext(null);
            size--;
        }
        else {
            throw new NoSuchFieldException("La lista esta vacia");
        }
    }
    /**
     * Método que remueve el valor del ultimo  nodo (tail), si la lista no esta vacia.
     * @throws NoSuchFieldException genera un Excepción si la lista esta vacía
     */

    public void removeLast() throws NoSuchFieldException {
        if(head != null){
            if(head.getNext()==null){
                head.setNext(null);
                size--;
            }
            else {
                Node<E> pointer = head;
                while (pointer.getNext().getNext() != null){
                    pointer = pointer.getNext();
                }
                pointer.setNext(null);
                size--;
            }
        }

        else {
                throw new NoSuchFieldException("La lista esta vacia");
        }
    }


    /**
     * Método para obtener el primer nodo
      * @return el primer nodo que es head
     */
    public Node<E> getHead() {
        return head;
    }

    /**
     * Método para establecer el valor del primer nod
     * @param head valor del primer nodo
     */
    public void setHead(Node<E> head) {
        this.head = head;
    }

    /**
     * Método obtener el valor del ultimo nodo
     * @return valor del ultimo nodo
     */
    public Node<E> getTail() {
        return tail;
    }

    /**
     * Método para establcer el valor del ultimo nodo
     * @param tail valor del ultimo nodo
     */
    public void setTail(Node<E> tail) {
        this.tail = tail;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> c = head;
            @Override
            public boolean hasNext() {
                return c != null;
            }

            @Override
            public E next() {
                E value = c.getData();
                c = c.getNext();
                return value;
            }
        };

    }
}

import java.lang.IndexOutOfBoundsException; // Usar esto cuando se salga el índice

public class LinkedListMauricio {
    private Node head;
    private Node tail;
    private int size;

     /**
     * Returns the node at the specified position in this list.
     * @param index - index of the node to return
     * @return the node at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    public LinkedListMauricio()
    {
        this.size = 0;
        this.head = null; 
        this.tail=null;
    }

     /**
     * Returns if the LinkedList is Empty or not.
     * @return boolean if the LinkedList is Empty or not.
     */
    public boolean isEmpty(){
        return size==0;
    }

     /**
     * Returns the size of the LinkedList.
     * @return the size of the LinkedList
     */
    public int size(){
        return size;
    }

    /**
     * Returns the node at the specified position in this list.
     * @param index - index of the node to return
     * @return the node at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    private Node getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Returns the element at the specified position in this list.
     * @param index - index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    public int get(int index) throws IndexOutOfBoundsException {
        Node temp = getNode(index);
        return temp.data;
    }

    // Inserta un dato en la posición index
     /**
     * Insert a Node in the List
     * @param index - index of the node to return
     * @param data - data of the new Node
     * @throws IndexOutOfBoundsException
     */
    public void insert(int data, int index) throws IndexOutOfBoundsException {
        if (isEmpty()){
            Node nuevo= new Node(data);
            head=nuevo;
            tail=nuevo;
            size++;
        }
        else if (index==0) {
            Node nuevo= new Node(data);
            nuevo.next=head;
            head=nuevo;
            Node temp= head.next;
             temp.previous=head;
            size++;
        } else if (index>=0 && index<size) {
            Node nuevo = new Node(data);
            Node temp=getNode(index);
            Node temp2=getNode(index-1);
            nuevo.next=temp;
            nuevo.previous=getNode(index-1);
            temp.previous=nuevo;
            temp2.next=nuevo;
            size++;
        } else if (index==size){
            Node nuevo=new Node(data);
            tail.next= nuevo;
            nuevo.previous=tail;
            tail=nuevo;
            Node temp=tail.previous;
            temp.next=tail;
            size++;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    //Borra el dato en la posición index
     /**
     * Remove a Node of the specifics position of the list
     * @param index - index of the node to return
     * @throws IndexOutOfBoundsException
     */
    public void remove(int index) throws IndexOutOfBoundsException
    {   
        if (isEmpty()){
            throw new IndexOutOfBoundsException();  
        }else if (index==0) {
            Node temp=head;
            if (head==tail) {
                tail=null;
            } else {
                head.next.previous=null; 
            }
            head=head.next;
            temp.next=null;
            size--;
        } else if (index>0 && index<size-1){
            Node temp=getNode(index-1);
            temp.next=temp.next.next;
            size--;
        } else if (index==size-1){
            Node temp =tail;
            if (head==tail) {
                head=null;
            } else {
                tail.previous.next=null;
            }
            tail=tail.previous;
            temp.previous=null;
            size--;
        }else {
            throw new IndexOutOfBoundsException();  
        }
    }

    // Verifica si está un dato en la lista
    /**
     * Verify if a specific data is in the List
     * @param data - Data of the Node
     */
    public boolean contains(int data)
    {
        Node nodoEncontrado=head;
        while (nodoEncontrado!=null){
            if (nodoEncontrado.data==data){
                return true;
            } else {
                nodoEncontrado=nodoEncontrado.next;
            }
        }
        return false;
    }

    public static void main (String[]args){
        LinkedListMauricio list=new LinkedListMauricio();
        list.insert(0,0);
        list.insert(1,0);
        list.insert(10,2);
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println(list.contains(10));
        System.out.println(list.contains(2));
        list.remove(2);
        list.remove(0);
        list.remove(0);
        list.remove(0);
        
    }
}

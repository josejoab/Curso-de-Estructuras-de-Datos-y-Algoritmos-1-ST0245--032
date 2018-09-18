import java.lang.IndexOutOfBoundsException; // Usar esto cuando se salga el índice
// Una lista simplemente enlazada
public class LinkedListJKM {
private Node first;
private int size;
public LinkedListJKM()
{
	size = 0;
	first = null;	
}

	/**
	 * Returns the node at the specified position in this list.
	 * @param index - index of the node to return
	 * @return the node at the specified position in this list
	 * @throws IndexOutOfBoundsException
	 */
	private Node getNode(int index) throws IndexOutOfBoundsException {
		if (index >= 0 && index < size) {
			Node temp = first;
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

// Retorna el tamaño actual de la lista
public int size()
{
    size = 0;
    Node temp = first;
    while(temp != null){
        temp = temp.next;
        size++;
    }
    return size;
}

// Inserta un dato en la posición index
public void insert(int data, int index)
{
    int contador = 0;
    Node temp = first;
    Node temp2;
    if(size()==0){
        first = new Node(data);
    }
    else if (index == 0){
        Node temp3 = first;
        first = new Node(data);
        first.next=temp3;
    }
    else {
    while(contador <= index-1){
        if(contador == index-1){
            temp2 = temp.next;
            temp.next = new Node(data);
            temp.next.next = temp2;
        }
        contador++;
        temp = temp.next;
        }
    }
    
}



// Borra el dato en la posición index
public void remove(int index)
{
    Node temp = first;
     if (index == 0){
        first=temp.next;
    }
     else{
    for(int i = 0; i <= index; i++){
        if(i == index-1){
            temp.next = temp.next.next;
            break;    
        }   
        temp = temp.next;
    }
     }
}

public boolean containsRec(int data, Node temp) {
    //return temp == null? false: temp.data == data? true : containsRec(data, temp.next);
   if (temp == null){
     
     return false;
   }
   else {
     if (temp.data == data)
       return true;
     else
        return containsRec(data, temp.next);
     }
}

  // Verifica si está un dato en la lista
public boolean containsRec(int data) {
   return containsRec(data, first);
}

// Verifica si está un dato en la lista
public boolean contains(int data) {
   Node nodoQueEstoyVisitando = first;
	 while (nodoQueEstoyVisitando != null) {
     if (nodoQueEstoyVisitando.data == data){
       return true;
     }
     nodoQueEstoyVisitando = nodoQueEstoyVisitando.next;
   }
   return false;
}
}

// Un nodo para una lista doblemente enlazada
public class Node {
    public int data;
    public Node next;
    public Node previous;
    
    public Node(int data)
    {
        next = null;
        this.data = data;
    }

    public void setData(int data){
        this.data=data;
    }

    public int getData(){
        return data;
    }

    public void setNode(Node next){
        this.next=next;
    }

    public Node getNode(){
        return next;
    }
}

package queues;

public class LinkedList<T>
{
    private T data;
    private LinkedList<T> prevNode, nextNode;

    // Constructs a new element

    public LinkedList(T data, LinkedList<T> node)
    {
        this.setData(data);
        this.setPrevNode(node);
        this.setNextNode(null);
    }

    // Clone Object
    public LinkedList(LinkedList<T> node)
    {
        this.setData(node.data);
        this.setPrevNode(node.prevNode);
        this.setNextNode(node.nextNode);
    }

    // Setter
    public void setData(T data)
    {
        this.data = data;
    }

    // Return Data
    public T getData()
    {
        return this.data;
    }

    // Setter
    public void setPrevNode(LinkedList<T> node)
    {
        this.prevNode = node;
    }

    // Setter
    public void setNextNode(LinkedList<T> node)
    {
        this.nextNode = node;
    }


    // Return
    public LinkedList<T> getPrevious()
    {
        return this.prevNode;
    }

    // Return
    public LinkedList<T> getNext()
    {
        return this.nextNode;
    }

}

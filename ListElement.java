import java.util.List;

public class ListElement<T> {

    private T data;
    private ListElement<T> next;

    public ListElement(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ListElement<T> getNext() {
        return next;
    }

    public void setNext(ListElement<T> next) {
        this.next = next;
    }

    // This method insert node before given head node.
    // After calling this method, u need to update head node with return element
    public ListElement<T> insertBefore(ListElement<T> head, T data) {
        ListElement<T> l = new ListElement<>(data);
        l.setNext(head);
        return l;
    }

    // Find data in the give head linked list.
    public ListElement<T> find(ListElement<T> head, T data) {
        ListElement<T> element = head;
        while(element != null && element.getData() != data) {
            element = element.getNext();
        }
        return element;
    }
}

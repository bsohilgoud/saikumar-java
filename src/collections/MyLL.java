package collections;

public class MyLL {

    Node head;
    public int size;

    public void add(String value){
        if(head == null)
            head = new Node(value);
        else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(value);
        }
    }

    public void addFirst(String value){
        if(this.head == null)
            head = new Node(value);
        else {
            Node first = new Node(value);
            first.next = head;
            head = first;
        }
    }

    public void addAtPosition(String value, int pos){
        if(pos > size)
            throw new IndexOutOfBoundsException("The provided position is out of bounds");
        Node temp = head;
        int cur = 0;
        // Harshith -> b1 -> bargav2 -> vamshui -> sai -> NULL
        while (temp!= null && cur < pos - 1){
            temp = temp.next;
            cur++;
        }

        Node newN = new Node(value);
        newN.next = temp.next;
        temp.next = newN;
    }

    private class Node {
        String value;
        Node next;
        Node(String value) {
            this.value = value;
        }
    }

    @Override
    public String toString(){
        Node temp = head;
        StringBuilder str = new StringBuilder();
        while (temp != null){
            str.append(temp.value).append(" -> ");
            temp = temp.next;
        }
        str.append("NULL");
        return str.toString();
    }
}

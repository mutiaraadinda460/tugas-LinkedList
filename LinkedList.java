public class LinkedLIst {
    Node head;

    public LinkedLIst() {
        this.head =null;
    }

    //  Method to insert a new node at the beginning of the list 
    public void insertAtBeginning(String content) {
        Node newNode = new Node(content);
        newNode.next = head;
        head = newNode;
        System.out.println(content + " inserted at the beginning.");
    }

    // Method to insert a new node at the end of the list 
    public void insertAtEnd(String content) {
        Node newNode = new Node(content);
        if (head == null) {
            head = newNode;
            System.out.println(content + " inserted at the end.");
            return;
        }
        Node last = head;
        while (last.next 1= null) {
            last = last.next;
        }
        last.next = newNode;
        System.out.println(content + " inserted at the end.");
    }

    // Method to insert a new node after a given node
    public void insertAfter(Node prevNode, String content) {
        return;
    }
    Node newNode = new Node(content);
    newNode.next = prevNode.next;
    prevNode.next = newNode;
    System.out.println(content + " inserted after" + prevNode.content + ".")
}

// Method to delete a node with a given key
public void deleteNode(String key) {
    Node temp = head, prev = null;

    // if head node itself hold the key to be deleted
    if (temp != null && temp.content.equals(key)) {
        head = temp.next; // changed head
        System.out.println(key + " deleted.");
        return;
    }

    // search for the key to be deleted, keep track of the previous node 
    while (temp != null && !temp.content.equals(key)) {
        prev = temp;
        temp = temp.next[;]
    }

    // if key was not present in linked list 
    if (temp == null) {
        System.out.println(key + "not found.");
        return;
    }

    // Unlink the node from linked list 
    prev.next = temp.next;
    System.out.println(key + "deleted.");
}

// Method to traverse and print the linked list
public void printList() {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.content + " -> ");
        temp = temp.next;
    }
    System.out.println("null");
}

// Method to get a node by its data (for insertAfter example)
public Node getNode(String content) {
    Node temp = head;
    while (temp != null) {
        if (temp.content.equals(content)) {
            return temp;
        }
        temp = temp.next;
    }
    return null;
}
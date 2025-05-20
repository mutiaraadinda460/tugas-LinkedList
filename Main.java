public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // insert elements
        list.insertAtEnd("Budi");
        list.insertAtEnd("Andi");
        list.insertAtEnd("Citra");
        list.insertAtEnd("Dewi");

        // print the list
        System.out.println("Linked List after insertions:");
        list.printList(); // Expected: Andi -> Budi -> Citra -> Dewi -> null

        // Insert after a specific node
        Node nodeBudi = list.getNode("Budi");
        if (nodeBudi != null) {
            list.insertAfter(nodeBudi, "Eka");
        }
    
        // Print the list after insertAfter
        System.out.println("\nLinked List after inserting Eka after Budi");
        list.printList(); // Expected: Andi -> Budi -> Eka -> Citra -> Dewi -> null

        // Delete a node 
        list.deleteNode("Citra");

        // print the list after delection
        System.out.println("\nLinked List after deleting Citra:");
        list.printList(); // Expected: Andi -> Budi -> Eka -> Dewi -> null

        // Delete a non-existent node
        list.deleteNode("Fajar");

        // print the list after trying to delete non-existent node
        System.out.println("\nLinked List after trying to delete Fajar:");
        list.printList(); // Expected: Andi -> Budi -> Eka -> Dewi -> Null
    }
}
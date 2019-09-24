public class LinkedList {

    private ListNode firstNode;
    private ListNode lastNode;
    private String name;

    ListNode getFirstNode() {
        return firstNode;
    }

    LinkedList(ListNode firstNode, ListNode lastNode) {
        this.firstNode = firstNode;
        this.lastNode = lastNode;
    }

    void setFirstNode(ListNode firstNode) {
        this.firstNode = firstNode;
    }

    ListNode getLastNode() {
        return lastNode;
    }

    void setLastNode(ListNode lastNode) {
        this.lastNode = lastNode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    boolean isEmpty() {
        return (getFirstNode() == null && getLastNode() == null);
    }

    void insertInFront(LinkedList list, int data) {
        ListNode listNode = new ListNode(data, list.getFirstNode());
        list.setFirstNode(listNode);
    }

    void insertInLast(LinkedList list, int data) {
        ListNode nextNode = list.getFirstNode().getNextNode();
        insertNodeInLast(list, data, nextNode, list.getFirstNode());
    }

    private void insertNodeInLast(LinkedList list, int data, ListNode nextNode, ListNode currentNode) {
        if(nextNode == null) {
            ListNode listNode = new ListNode(data, null);
            currentNode.setNextNode(listNode);
            list.setLastNode(listNode);
            return;
        }
        insertNodeInLast(list, data, nextNode.getNextNode(),currentNode.getNextNode());
    }

    void insertInBetween(LinkedList list, int data) {
        ListNode listFirstNode = list.getFirstNode();
        insertNodeInBetween(data, listFirstNode);
    }

    private void insertNodeInBetween(int data, ListNode listFirstNode) {
        if( listFirstNode.getData() < data && listFirstNode.getNextNode().getData() > data) {
            listFirstNode.setNextNode(new ListNode(data, listFirstNode.getNextNode()));
            return;
        }
        insertNodeInBetween(data, listFirstNode.getNextNode());
    }
}

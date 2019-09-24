public class RadomNumberGeneration {

    public static void main(String[] args) {
        int sum = 0;
        LinkedList list = new LinkedList(null, null);
        for(int i =0; i< 10; i++) {
            int data = (int) Math.round(Math.random() * 100);
            sum = sum + data;
            insertIntoLinkedList(list,  data);
        }
        printLinkedList(list);
    }

    private static void printLinkedList(LinkedList list) {
        if(list.isEmpty()) {
            return;
        }
        printNodes(list.getFirstNode());
    }

    private static void printNodes(ListNode firstNode) {
        System.out.println(firstNode.getData());
        if(firstNode.getNextNode() == null) {
            return;
        }
        printNodes(firstNode.getNextNode());
    }

    private static void insertIntoLinkedList(LinkedList list,  int data) {
        if(list.isEmpty()) {
            ListNode listNode = new ListNode(data, null);
            list.setFirstNode(listNode);
            list.setLastNode(listNode);
            return;
        }
        int firstData = (int) list.getFirstNode().getData();
        int lastData = (int) list.getLastNode().getData();
        if(firstData < data && lastData < data) {
            list.insertInLast(list, data);
        }
        if(firstData > data && lastData > data) {
            list.insertInFront(list, data);
        }

        if(firstData < data && data < lastData) {
            list.insertInBetween(list, data);
        }
    }
}

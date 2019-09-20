public class TestLinkedList {

    public static void main(String[] args) {
        ListNode data10 = new ListNode("data10", null);
        ListNode data09 = new ListNode("data09", data10);
        ListNode data08 = new ListNode("data08", data09);
        ListNode data07 = new ListNode("data07", data08);
        ListNode data06 = new ListNode("data06", data07);
        ListNode data05 = new ListNode("data05", null);
        ListNode data04 = new ListNode("data04", data05);
        ListNode data03 = new ListNode("data03", data04);
        ListNode data02 = new ListNode("data02", data03);
        ListNode data01 = new ListNode("data01", data02);

        data06.ListConcatenate(data01, data06);
        printNodes(data01);
    }

    private static void printNodes(ListNode data01) {
        System.out.println(data01.getData());
        if(data01.getNextNode() == null) {
            return;
        }
        printNodes(data01.getNextNode());
    }
}

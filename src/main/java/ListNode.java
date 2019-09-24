public class ListNode {

        private int data;
        private ListNode nextNode;

        public ListNode(int data, ListNode nextNode) {
            setData(data);
            setNextNode( nextNode);
        }

        public void setNextNode(ListNode nextNode) {
            this.nextNode = nextNode;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int getData(){
            return  this.data;
        }

        public ListNode getNextNode() {
            return this.nextNode;
        }


    public ListNode ListConcatenate(ListNode list1, ListNode list2) {
        ListNode lastNode =  getLastNode(list1);
        setLastNode(lastNode, list2);
        return list1;
    }

    private void setLastNode(ListNode lastNode, ListNode list2) {
            lastNode.setNextNode(list2);
    }

    private ListNode getLastNode(ListNode list1) {
            if(list1.getNextNode() == null) {
                return list1;
            }
        return getLastNode(list1.getNextNode());
    }
}

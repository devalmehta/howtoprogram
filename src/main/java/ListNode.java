public class ListNode {

        private Object data;
        private ListNode nextNode;

        public ListNode(Object data, ListNode nextNode) {
            setData(data);
            setNextNode( nextNode);
        }

        public void setNextNode(ListNode nextNode) {
            this.nextNode = nextNode;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Object getData(){
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

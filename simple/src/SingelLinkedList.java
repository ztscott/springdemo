public class SingelLinkedList {
    public static void main(String[] args) {
        SingelLinkedList si = new SingelLinkedList();


        si.addHead(1);
        si.addHead(2);
        System.out.println();
    }

    private int length;//链表个数
    private Node head;//头节点

    public SingelLinkedList() {

    }

    private static class Node{
        Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }
    }
    public Object addHead(Object obj){
        Node newNode = new Node(obj);
        if(length == 0){   //如果链表长度为0直接新节点作为头部节点
            head = newNode;
        }else{
            head = newNode;
            newNode.next = head;

        }
        length++;
        return obj;

    }
    public boolean delete(Object value){
        if(length == 0){
            return false;
        }
        Node current = head;
        Node previous = head;
        while(current.data != value){
            if(current.next == null){
                return false;
            }else{

            }

        }
        //如果删除的节点是头节点
        if(current == head){
            head = current.next;
            length--;
        }else{
            previous.next = current.next;
            length--;

        }
        return false;

    }


}

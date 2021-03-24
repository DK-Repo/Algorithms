package home.root.revertLinkedList;

public class RevertLinkedListInMemory {

    public <T> ListNode<T> reverseIterative(ListNode<T> head) {
        ListNode<T> before = null;
        ListNode<T> target = head;

        while (target != null) {
            ListNode<T> next = target.next;
            target.next = before;

            before = target;
            target = next;
        }
        return before;
    }

    public <T> ListNode<T> reverseRecursive(ListNode<T> head) {

        if (head == null || head.next == null) return head;

        ListNode<T> res = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return res;
    }

    static class ListNode<T> {
        T data;
        ListNode<T> next;

        public ListNode(T data) {
            this.data = data;
        }

        public ListNode(T data, ListNode<T> next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }
}

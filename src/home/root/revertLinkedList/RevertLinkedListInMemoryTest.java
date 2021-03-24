package home.root.revertLinkedList;

import home.root.revertLinkedList.RevertLinkedListInMemory.ListNode;
import org.junit.Before;
import org.junit.Test;

public class RevertLinkedListInMemoryTest {

    private static final RevertLinkedListInMemory MOCK = new RevertLinkedListInMemory();
    private ListNode<Integer> head;

    @Before
    public void init() {
        ListNode<Integer> last = new ListNode<>(1);
        ListNode<Integer> a = new ListNode<>(2, last);
        ListNode<Integer> b = new ListNode<>(3, a);
        ListNode<Integer> c = new ListNode<>(4, b);
        ListNode<Integer> d = new ListNode<>(5, c);
        ListNode<Integer> e = new ListNode<>(6, d);
        head = new ListNode<>(7, e);
    }

    @Test
    public void recursiveReverse() {
        System.out.println(head);
        head = MOCK.reverseIterative(head);
        System.out.println(head);
    }

    @Test
    public void iteratorReverse() {
        System.out.println(head);
        head = MOCK.reverseRecursive(head);
        System.out.println(head);
    }
}

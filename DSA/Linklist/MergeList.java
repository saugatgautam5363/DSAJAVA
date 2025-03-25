package DSA.Linklist;

public class MergeList {
    NodeMerge head;

    static class NodeMerge {
        int data;
        NodeMerge next;

        NodeMerge(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        NodeMerge currentNode = new NodeMerge(data);
        currentNode.next = head;
        head = currentNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty!!");
            return;
        }
        NodeMerge temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static NodeMerge mergeSortedLists(NodeMerge list1, NodeMerge list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        NodeMerge dummy = new NodeMerge(-1);
        NodeMerge current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) current.next = list1;
        if (list2 != null) current.next = list2;

        return dummy.next;
    }

    public static void main(String[] args) {
        MergeList list1 = new MergeList();
        MergeList list2 = new MergeList();

        list1.addFirst(7);
        list1.addFirst(5);
        list1.addFirst(3);
        list1.addFirst(1);

        list2.addFirst(8);
        list2.addFirst(6);
        list2.addFirst(4);
        list2.addFirst(2);

        System.out.println("List 1:");
        list1.printList();

        System.out.println("List 2:");
        list2.printList();

        MergeList mergedList = new MergeList();
        mergedList.head = mergeSortedLists(list1.head, list2.head);

        System.out.println("Merged List:");
        mergedList.printList();
    }
}

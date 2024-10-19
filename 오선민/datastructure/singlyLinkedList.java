public class singlyLinkedList<E> {
    private Node<E> head; // 노드의 첫 부분을 가리키는 포인트
    private Node<E> tail; // 노드의 마지막 부분을 가리키는 포인트
    private int size; // 요소 개수

    public singlyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    private static class Node<E> {
        private E element; // Node에 담을 데이터
        private Node<E> next; // 다음 Node 객체를 가르키는 레퍼런스
        // 생성자
        Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }

    // search 구현하기
    private Node<E> search(int index) {
        Node<E> n = head;
        for (int i = 0; i < index; i++) {
            n = n.next;
        }
        return n;
    }

    // add 구현하기
    // 1. void addFirst: 첫번째 위치에 요소 추가
    // 2. void addLast: 마지막 위치에 요소 추가
    // 3. boolean add: 마지막 위치에 요소 추가 (성공하면 true)
    // 4. void add: 지정된 위치에 요소 추가

}

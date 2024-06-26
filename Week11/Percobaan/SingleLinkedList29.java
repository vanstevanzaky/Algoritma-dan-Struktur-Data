public class SingleLinkedList29 {
    Node29 head, tail;

    boolean isEmpty(){
    return head == null;
    }
    void print() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else {
            Node29 tmp = head;
            System.out.print("Isi Linked List: ");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }
    }

    void addFirst(int input){
        Node29 ndInput = new Node29(input, null);
            if(isEmpty()){
                head = ndInput;
                tail = ndInput;
            } else {
                ndInput.next = head;
                head = ndInput;
            }
    }
    void addLast(int input){
        Node29 ndInput = new Node29(input, null);
            if(isEmpty()){
                head = ndInput;
                tail = ndInput;
            } else {
                tail.next = ndInput;
                tail = ndInput;
            }
        
    }
    void insertAfter(int key, int input){
        Node29 ndInput = new Node29(input, null);
            Node29 temp = head;
            do {
                if (temp.data == key) {
                    ndInput.next = temp.next;
                    temp.next = ndInput;
                    if (ndInput.next == null) {
                        tail = ndInput;;   
                    }
                    return;
                }
                temp = temp.next;
            } while (temp != null);
        
    }
    void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Index tidak valid!");
            return;
        } else if (index == 0) {
            addFirst(input);
            return;
        } else {
            Node29 temp = head;
            for (int i = 0; temp != null && i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node29(input, temp.next);
            if (temp.next.next == null) {
                tail=temp.next;
            }
        } 
    }
    public int getData (int index) {
        Node29 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    int indexOf (int key) {
        Node29 tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }
    
    void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node29 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }  
    void remove (int key){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong"+" tidak dapat dihapus");
        }else{
            Node29 temp = head;
            while (temp!= null) {
                if (temp.data != key && temp == head) {
                    removeFirst();
                    break;
                } else if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node29 temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}


public class BinaryTree29 {
    Node29 root;

    public BinaryTree29() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data){
        if(isEmpty()) {
            root = new Node29(data);
        } else {
            Node29 current = root;
            while(true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node29(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node29(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean result = false;
        Node29 current = root;
        while(current != null) {
            if (current.data == data) {
                result = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    void traversePreOrder(Node29 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node29 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node29 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node29 getSuccessor(Node29 del) {
        Node29 successor = del.right;
        Node29 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is Empty!");
            return;
        }
        Node29 parent = root;
        Node29 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        } if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node29 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
    void recursion(int key) {
        root = recursion(root, key);
    }
    public Node29 recursion(Node29 current, int data) {
        if (current == null) {
            return new Node29(data);
        } else if (data < current.data) {
            current.left = recursion(current.left, data);
        } else if (data > current.data) {
            current.right = recursion(current.right, data);
        } else {
            return current;
        }
        return current;
    }
    void tampilMax() {
        Node29 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println(current.data);
    }

    void tampilMin() {
        Node29 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println(current.data);
    }

    void tampilLeaf(Node29 root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.print(" " + root.data);
            return;
        }
        if (root.left != null) {
            tampilLeaf(root.left);
        }
        if (root.right != null) {
            tampilLeaf(root.right);
        }
    }

    int jumlahLeaf() {
        return jumlahLeaf(root);
    }
    int jumlahLeaf(Node29 Node) {
        if (Node == null) {
            return 0;
        }
        if (Node.left == null && Node.right == null) {
            return 1;
        } else {
            return jumlahLeaf(Node.left) + jumlahLeaf(Node.right);
        }
    }












}

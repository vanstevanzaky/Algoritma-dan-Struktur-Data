package Tugas;
public class Queue29 {
    Pembeli29[] antrian;
    int front;
    int rear;
    int size;
    int max;
    public Queue29(int n){
        max = n;
        antrian = new Pembeli29[max];
        size = 0;
        front = rear = -1;
    }
    public boolean isEmpty() {
        if (size == 0) {
            return true; 
        } else {
            return false;
        }
    }
    public boolean isFull() {
        if (size == max) {
        return true;
        } else {
            return false;
        }
    }
    public void Enqueue(Pembeli29 dt) {
        if (isFull()) {
            System.out.println("Queue Sudah Penuh!");
            System.exit(0);
        } else {
            if (isEmpty()) {
                front = rear =0;
            } else {
                if (rear == max -1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = dt;
            size++;
        }
    }
    public Pembeli29 Dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Masih Kosong");
            return null;
        }
        Pembeli29 dt = antrian[front];
        size--;
        if (isEmpty()) {
            front = rear = -1;
        } else {
            front = (front + 1) % max;
        }
        return dt;
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Queue Masih Kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHp);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHp);
            System.out.println("Jumlah elemen =  " + size);
        }
    }
    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + antrian[front].nama + " " + antrian[front].noHp );
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }
    public void peekRear() {
        if (!isEmpty()) {
        System.out.println("Elemen paling belakang: " +
        antrian[rear].nama + " " + antrian[rear].noHp);
        } else {
        System.out.println("Queue Masih Kosong");
        }
    }
    public void peekPosition(String nama) {
        int posisi = -1;
        for (int i = 0; i < size; i++) {
            if (antrian[i].nama.equalsIgnoreCase(nama)){
                posisi = i + 1;
                break;
            }
        }
        if (posisi != -1) {
            System.out.println("Pelanggan " + nama + " berada di posisike-" + posisi);
        } else {
            System.out.println("Pelanggan " + nama + " tidak ditemukan dalam antrian");
        }
    }
    public void daftarPembeli() { 
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Daftar Pelanggan dalam Antrian : ");
            int i = front;
            do {
                System.out.println(antrian[i].nama);
                i = (i + 1) % max;
            } while (i != rear);
            System.out.println(antrian[i].nama);
        }
    }

    
   
    
}



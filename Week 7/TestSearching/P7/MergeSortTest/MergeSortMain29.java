package TestSearching.P7.MergeSortTest;
public class MergeSortMain29 {
        public static void main(String[] args) {
            int data[] = {10,40,30,50,70,20,100,90};
            MergeSorting29 mSort = new MergeSorting29();
            System.out.println("data awal"); 
            mSort.printArr(data);
            mSort.mergeSort(data);
            System.out.println("");
            System.out.println("setelah diurutkan ");
            mSort.printArr(data);
        }
    
}

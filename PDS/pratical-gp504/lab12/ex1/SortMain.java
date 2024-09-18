package lab12.ex1;

public class SortMain {
    
    public static void main(String[] args) {

        SortInterface quickSort = new QuickSort();
        SortInterface bubbleSort = new BubbleSort();
        SortInterface mergeSort = new MergeSort();

        Phone phone1 = new Phone("Galaxy S21", "Samsung", 999.99);
        Phone phone2 = new Phone("iPhone 12", "Apple", 1099.99);
        Phone phone3 = new Phone("Mi 11", "Xiaomi", 799.99);
        Phone phone4 = new Phone("OnePlus 9", "OnePlus", 899.99);
        Phone phone5 = new Phone("Pixel 5", "Google", 699.99);

        PhoneList phoneList = new PhoneList(quickSort);

        phoneList.addPhone(phone1);
        phoneList.addPhone(phone2);
        phoneList.addPhone(phone3);
        phoneList.addPhone(phone4);
        phoneList.addPhone(phone5);

        System.out.println("\nQuick Sort:");
        phoneList.sort();
        for (Phone phone : phoneList.getPhoneList()) {
            System.out.println(phone);
        }
        System.out.println();

        System.out.println("Bubble Sort:");
        phoneList.setSortStrat(bubbleSort);
        phoneList.sort();
        for (Phone phone : phoneList.getPhoneList()) {
            System.out.println(phone);
        }
        System.out.println();

        System.out.println("Merge Sort:");
        phoneList.setSortStrat(mergeSort);
        phoneList.sort();
        for (Phone phone : phoneList.getPhoneList()) {
            System.out.println(phone);
        }   

    }
}

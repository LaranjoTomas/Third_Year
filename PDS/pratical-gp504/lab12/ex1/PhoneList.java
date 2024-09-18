package lab12.ex1;

import java.util.ArrayList;

public class PhoneList {
    
    private SortInterface sortInterface;
    private ArrayList<Phone> phoneList;

    public PhoneList(SortInterface sortInterface) {
        this.sortInterface = sortInterface;
        phoneList = new ArrayList<>();
    }

    public void addPhone(Phone phone) {
        phoneList.add(phone);
    }

    public void setSortStrat(SortInterface sortInterface) {
        this.sortInterface = sortInterface;
    }

    public void sort() {
        sortInterface.sort(phoneList);
    }

    public ArrayList<Phone> getPhoneList() {
        return phoneList;
    }
}

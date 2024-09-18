package lab12.ex1;

import java.util.ArrayList;

public class BubbleSort implements SortInterface {

    @Override
    public void sort(ArrayList<Phone> phoneList) {
        for (int i = 0; i < phoneList.size(); i++) {
            for (int j = 0; j < phoneList.size() - 1; j++) {
                if (phoneList.get(j).getPrice() > phoneList.get(j + 1).getPrice()) {
                    Phone temp = phoneList.get(j);
                    phoneList.set(j, phoneList.get(j + 1));
                    phoneList.set(j + 1, temp);
                }
            }
        }
    }

}

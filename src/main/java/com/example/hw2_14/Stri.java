package com.example.hw2_14;

public class Stri implements StringList {
    private static final int size = 15;
    private final String[] mas;
    private int indexNumber;

    public Stri() {
        mas = new String[size];
        indexNumber = 0;
    }

    public Stri(int q) {
        if (q <= 0) {
            throw new IllegalArgumentException("размер отриц!!!");
        }
        mas = new String[q];
        indexNumber = 0;
    }

    @Override
    public String add(String item) {
        return add(indexNumber, item);
    }

    @Override
    public String add(int index, String item) {
        if (index > indexNumber || index < 0) {
            throw new IllegalArgumentException("выход за границы масива");
        }
         if (item == null){
             throw new IllegalArgumentException("null ");
         }
         if(indexNumber == mas.length){
             throw new IllegalArgumentException("");
         }
         if ( index < indexNumber) {
             System.arraycopy(mas, index, mas, index + 1, indexNumber - index);
         }
         mas[index] = item;
         indexNumber++;
         return item;
    }

    @Override
    public String set(int index, String item) {
        if (index >= indexNumber || index < 0) {
            throw new IllegalArgumentException("выход за границы масива");
        }

        return mas[index] = item;
    }

    @Override
    public String remove(String item) {
        if (indexOf(item) == -1) {
            throw new IllegalArgumentException("выход за границы масива");
        }
        return remove(indexOf(item));
    }

    @Override
    public String remove(int index) {
        if (index >= indexNumber || index < 0) {
            throw new IllegalArgumentException(" выход за границы масива");
        }
        String removeItem = mas[index];
        if (index + 1 < indexNumber) {
            System.arraycopy(mas, index + 1, mas, index, indexNumber - index);
        }
        indexNumber--;
        mas[indexNumber] = null;
        return removeItem;
    }

    @Override
    public boolean contains(String item) {
        if (item == null) {
            throw new IllegalArgumentException("незя использовать null");
        }
        return indexOf(item) != -1;
    }

    @Override
    public int indexOf(String item) {
        if (item == null) {
            throw new IllegalArgumentException("незя использовать null");
        }
        for (int i = 0; i < indexNumber; i++) {
            if (mas[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        if (item == null) {
            throw new IllegalArgumentException("нельзя использовать null");
        }
        for (int i = indexNumber - 1; i >= 0; i--) {
            if (mas[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        if (index >= indexNumber || index < 0) {
            throw new IllegalArgumentException(" выход за границы масива");
        }
        return mas[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        if (otherList == null || size() != otherList.size()) {
            return false;
        }
        for (int i = 0; i < indexNumber; i++) {
            if (get(i).equals(otherList.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return indexNumber;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < indexNumber; i++) {
            mas[i] = null;
        }
        indexNumber = 0;
    }


    @Override
    public String[] toArray() {
        String[] array = new String[indexNumber];
        System.arraycopy(mas, 0, array, 0, indexNumber);
        return array;
    }
}

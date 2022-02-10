package com.nf.linked;

public class AnimalListItem {
    private final Animal value;
    private AnimalListItem next;

    public AnimalListItem(Animal value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }

    public void setNext(AnimalListItem next) {
        this.next = next;
    }

    public AnimalListItem getNext() {
        return next;
    }

    public boolean hasNext(){
        return next != null;
    }

    public Object getValue() {
        return value;
    }
}

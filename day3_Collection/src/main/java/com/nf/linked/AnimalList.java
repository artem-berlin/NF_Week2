package com.nf.linked;

public class AnimalList {
    private static AnimalListItem head;

    public static void add(Animal animal){
        if(head==null){
            head = new AnimalListItem(animal);
        } else {
            nextElement(head).setNext(new AnimalListItem(animal));
        }
    }
    private static AnimalListItem nextElement(AnimalListItem animalListItem){
        if (animalListItem.getNext() == null) {

            return animalListItem;
        } else {
            return nextElement(animalListItem.getNext());
        }
    }
           //  add Methode with while loop!!!
//    private static void add(Animal animalToAdd) {
//        AnimalListItem newItem = new AnimalListItem(animalToAdd);
//        if (head == null) {
//
//            head = newItem;
//        } else {
//
//            AnimalListItem currentItem = head;
//            while (currentItem.getNext() != null) {
//                currentItem = currentItem.getNext();
//            }
//            currentItem.setNext(newItem);
//        }
//    }
                       //  Remove check!!!
           public void remove(Animal animalToRemove) {

               if (head.getValue().equals(animalToRemove)) {
                   if (head.getNext() != null) {
                       head = head.getNext();
                   } else {
                       head = null;
                   }
               } else {

                   AnimalListItem currentItem = head.getNext();
                   AnimalListItem beforeCurrentItem = head;
                   while (!currentItem.getValue().equals(animalToRemove)){
                       if (currentItem.getNext()!=null){
                           currentItem = currentItem.getNext();
                           beforeCurrentItem = beforeCurrentItem.getNext();
                       } else {
                           return;
                       }
                   }
                   beforeCurrentItem.setNext(currentItem.getNext());
               }

           }


    //    Head to String
//        @Override
//    public String toString(){
//        return head.toString();
//    }
//    @Override
//    public String toString() {
//        if (head == null){
//            return "";
//        }
}




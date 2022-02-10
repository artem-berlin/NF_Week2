package com.nf.linked;

//import com.nf.linked.Animal;
//import com.nf.linked.AnimalList;
//import com.nf.linked.AnimalListItem;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        Animal dog1 = new Animal("dog1");
        Animal dog2 = new Animal("dog2");
        int dogCode = dog1.hashCode();
        System.out.println(dogCode);
        AnimalList dogList = new AnimalList();

        AnimalList.add(dog);
        AnimalList.add(dog1);
        AnimalList.add(dog2);
        System.out.println(dogList);

    }


}
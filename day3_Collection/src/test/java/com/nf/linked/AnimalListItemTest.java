package com.nf.linked;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListItemTest {

        @org.testng.annotations.Test
        void ifEmptyList() {
            AnimalList empty_list = new AnimalList();
            assertEquals("", empty_list.toString());
        }

        @org.testng.annotations.Test
        void createElements3Elements() {
            AnimalList empty_list = new AnimalList();
            Animal a1 = new Animal("a");
            Animal a2 = new Animal("b");
            Animal a3 = new Animal("c");


            empty_list.add(a1);
            empty_list.add(a2);
            empty_list.add(a3);


            assertEquals("a->b->c", empty_list.toString());
        }

        private void assertEquals(String s, String toString) {
        }

        @org.testng.annotations.Test
        void proofElement() {
            AnimalList empty_list = new AnimalList();
            Animal a1 = new Animal("dog");

            empty_list.add(a1);
            assertEquals("dog", empty_list.toString());
        }

//    @Test
//    void shouldDeleteListItemAtEnd(){
//        //GIVEN
//        Animal testAnimal = new Animal("Elefant",4);
//        Animal animalToAdd = new Animal("Regenwurm",0);
//        Animal animalToRemove = new Animal("Fruchtfliegen",7);
//        AnimalList testList = new AnimalList(testAnimal);
//        testList.add(animalToAdd);
//        testList.add(animalToRemove);
//        //WHEN
//        testList.remove(animalToRemove);
//        //THEN
//        String actual = testList.toString();
//        assertNotNull(testList.getHead().getNext());
//        assertEquals("Ich bin ein Elefant und habe 4 Beine! -> Ich bin ein Regenwurm und habe 0 Beine!",actual);
//    }

  //  @Test
//    void shouldDeleteListItemInTheMiddle(){
//        //GIVEN
//        Animal testAnimal = new Animal("Elefant",4);
//        Animal animalToAdd = new Animal("Regenwurm",0);
//        Animal animalToRemove = new Animal("Fruchtfliegen",7);
//        AnimalList testList = new AnimalList(testAnimal);
//        testList.add(animalToRemove);
//        testList.add(animalToAdd);
//        //WHEN
//        testList.remove(animalToRemove);
//        //THEN
//        String actual = testList.toString();
//        assertNotNull(testList.getHead().getNext());
//        assertEquals("Ich bin ein Elefant und habe 4 Beine! -> Ich bin ein Regenwurm und habe 0 Beine!",actual);
//    }

//    @Test
//    void shouldDeleteHead(){
//        //GIVEN
//        Animal testAnimal = new Animal("Elefant",4);
//        Animal animalToAdd = new Animal("Regenwurm",0);
//        Animal animalToRemove = new Animal("Fruchtfliegen",7);
//        AnimalList testList = new AnimalList(testAnimal);
//        testList.add(animalToAdd);
//        testList.add(animalToRemove);
//        //WHEN
//        testList.remove(testAnimal);
//        //THEN
//        String actual = testList.toString();
//        assertNotNull(testList.getHead().getNext());
//                assertEquals("Ich bin ein Regenwurm und habe 0 Beine! -> Ich bin ein Fruchtfliegen und habe 7 Beine!",actual);
//    }
        @Test
    void testToString() {
    }

    @Test
    void setNext() {
    }

    @Test
    void getNext() {
    }

    @Test
    void hasNext() {
    }
}
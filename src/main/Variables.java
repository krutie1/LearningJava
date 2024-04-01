package main;

public class Variables {
    public static void main(String[] args) {
        int i1 = 1; // different
        int i2 = i1; // different
        // because they are primitive types, which means that they only contain values not references to another
        // type inside stack

//        System.out.println(i1);
//        System.out.println(i2);

        int[] numbers = {1,2,3,4}; // reference - copying a pointer to the value which is stored inside a heap
        int[] numbers2 = numbers; // reference - copying a pointer
        // if we change value inside number2, it changes value in both of them, because they are pointing to single
        // value in heap, which is mutable

        numbers2 = new int[5]; // creating new array, so they are not pointing to the same object

        // strings are immutable, so they are creating new object inside a heap, without referencing
        String s1 = "string"; // pointing to heap's object
        String s2 = s1; // pointing to same object
        /*
        * Objects in the Heap: When you create an object in Java using the new keyword, memory is allocated for that object on the heap. This memory allocation includes space for all the instance variables (fields) of the object.
        * Each object has its own set of instance variables, and they are stored as part of the object's memory allocation on the heap.
        * */

        System.out.println(s1);
        System.out.println(s2);

        s2 = "string 2";

        System.out.println(s1);
        System.out.println(s2);



    }
}

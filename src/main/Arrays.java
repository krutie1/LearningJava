package main;

public class Arrays {
    public static void main(String[] args) {
        int number = 1;
        // primitive
        /*
        * Primitive data types represent basic data types that are not objects and do not have methods.
        * They represent fundamental values such as integers, floating-point numbers, characters, and boolean values.
        *
        * */

        int[] numbers = new int[] { 1, 2, 3, 4, 5 };
        // reference data type
        /*
        * eference data types represent objects that are created using classes or interfaces.
        * They store references to objects in memory rather than the objects themselves.
        * */

        int[] lateInit = new int[]{}; // init array
        int[] lateIni2t = new int[5]; // already define size of our array
        int[] preDefine = {1,2,3}; // predefine values
        int[] preDefine2 = new int[]{1,2,3}; // predefine values


        System.out.println(numbers[4]);
    }
}

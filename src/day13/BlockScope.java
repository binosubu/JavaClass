package day13;

public class BlockScope {

    // need to add static keyword in-front if we need to use that variable in another block.
    // if variable is created in one block then it cannot be accessed into the different block.
    static int someInteger = 0;

    public static void main(String[] args) {
        int someOtherInteger = 8;
        someInteger = 5;
    }
    public void someOtherMethod(){
        someInteger = 10;
//      someOtherInteger = 8;  // cannot be accessed because someOtherInteger is in different block.
    }
}

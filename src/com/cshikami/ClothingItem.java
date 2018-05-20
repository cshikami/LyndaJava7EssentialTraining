package com.cshikami;

public class ClothingItem {

    public String type; //this is an instance variable, or a field (not static variable)
                        //an instance variable means it is not a member of the class itself
                        //its a member of an instance of the class

    public static void main(String[] args) {
        ClothingItem item = new ClothingItem(); //instantiation, creating an instance of the ClothingItem class
                                                //data type is name of class, ClothingItem
                                                //identifier is the name of the variable, item
                                                //then keyword new
                                                //then call to constructor method ClothingItem()

                                                //once the instance is created, the variables that you declared as
                                                //instance variables are available

        item.type = "Hat";  //can now assign a value to the instance variable, or field
        item.displayItem();
    }

    //class instances, or objects, can also have instance methods, and that is what displayItem() is
    private void displayItem() { //this method does not have static keyword and is therefore not a member of the class itself
                                //therefore, can call it from item, the object, and that will output information that belongs to
                                //that instance of the class
        System.out.println("This is a " + this.type); //this.type means the type variable that is a member of the current instance of this class
    }

}

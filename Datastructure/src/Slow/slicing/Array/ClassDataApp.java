package Slow.slicing.Array;

public class ClassDataApp {
    public static void main(String[] args) {
        int maxsize = 100;
        ClassDataArray arr;
        arr = new ClassDataArray(maxsize);
        arr.insert("Smith","java",23);
        arr.insert("coco","java",18);
        arr.insert("apple","java",45);
        arr.insert("join","java",56);
        arr.insert("respect","java",12);
        arr.display();
        Person found;
        String value = "join";
        found = arr.find(value);
        if(found == null)
            System.out.println(value + "not find");
        else
            System.out.println(value + "find");
        boolean flag;
        flag = arr.delete(value);
        System.out.println(arr);
        arr.display();
    }
}

package Slow.slicing.Array;

public class ClassDataArray {
    private Person[] a;
    private int nElems;
    public ClassDataArray(int max){
        a = new Person[max];
        nElems = 0;
    }

    public Person find(String searchName){
        int j;
        for(j = 0;j<nElems;j++){
            if(a[j].getLastName().equals(searchName)){
                break;
            }
        }
        if(j == nElems){
            return null;
        }
        else
            return a[j];
    }
    public void insert(String last,String first,int age){
        a[nElems] = new Person(last,first,age);
        nElems++;
    }
    public boolean delete(String last){
        int j;
        for (j=0;j<nElems;j++){
            if(a[j].getLastName().equals(last)){
                break;
            }
        }
        if (j == nElems)
            return false;
        else
            for (int i = j;i<nElems;i++){
                a[i] = a[i+1];
            }
            nElems--;
            return true;
    }
    public void display(){
        for (int i =0;i<nElems;i++){
            a[i].display();
        }
    }
}

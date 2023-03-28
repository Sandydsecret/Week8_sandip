package javaweek8sandip;

// 25. Example of Constructor Overloading

public class Pro_25_Student {
    int id;
    String name;
    int age;
    //creating two arg constructor
    Pro_25_Student(int i, String n){
        id = i;
        name = n;
    }
    //creating three arg constructor
    Pro_25_Student(int i, String n, int a){
        id = i;
        name = n;
        age=a;
    }
    public void display(){System.out.println(id+" "+name+" "+age);}
    public static void main(String args[]){
        Pro_25_Student s1 = new Pro_25_Student(111,"Karan");
        Pro_25_Student s2 = new Pro_25_Student(222,"Aryan",25);
        s1.display();
        s2.display();
    }
}

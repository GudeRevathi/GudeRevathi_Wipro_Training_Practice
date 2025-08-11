package oops;

public class Student {private String name;
    private int id;

    public Student(){
        System.out.println("Student Details");
    }

    public String getName() {
        return name;
    }
    public int getId(){
        return id;
    }
    public String setName(){
        return name;
    }
    public int setId(){
        return id;
    }

    public Student(String name, int id){
        this.name=name;
        this.id=id;
    }
    public  String toString(){
        return "Student [name=" + name + ", id=" + id + "]";
    }
}


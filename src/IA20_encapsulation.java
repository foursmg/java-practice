class Fresher{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }


}

public class IA20_encapsulation {
    public static void main(String[]args){

        Fresher f = new Fresher();

        f.setName("Kelly");
        f.setAge(32);

        System.out.println(f.getName());
        System.out.println(f.getAge());


    }
}

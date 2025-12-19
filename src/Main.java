//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Dog dog=new Dog("REX",2,"Brown");
        System.out.println("name:"+dog.name+
                "\nage:"+dog.age+
                "\nColor:"+dog.color);


        Dog dog2=new Dog("Max",1,"Black");
        System.out.println( );
        System.out.println("name:"+dog2.name+
                "\nage:"+dog2.age+
                "\nColor:"+dog2.color);

        Cat cat=new Cat("Luna",1,"Black");
        System.out.println(" ");
        System.out.println("name:"+cat.name+
                "\nage:"+cat.age+
                "\nColor:"+cat.color);


        Cat cat2=new Cat("Mimu",5,"Brown");
        System.out.println(" ");
        System.out.println("name:"+cat2.name+
                "\nage:"+cat2.age+
                "\nColor:"+cat2.color);

        Cat cat5=new Cat("Luna",1,"Black");
        System.out.println(" ");
        System.out.println("name:"+cat5.name+
                "\nage:"+cat5.age+
                "\nColor:"+cat5.color);
    }
}
public class Task2 {

    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.makeSound("Bark");
        obj.display();

        Cat obj2=new Cat();
        obj2.makeSound("Meows");
        obj2.display();
    }
}

public interface Animals{
    void makeSound(String str1);
}

public class Dog implements Animals{
    String sound;
    @Override
    public void makeSound(String newSound){
        sound=newSound;
    }
    void display(){
        System.out.println("Animals Name:Dog");
        System.out.println("Sound :"+sound);
    }
}

public class Cat implements Animals{
    String sound;
    @Override
    public void makeSound(String newSounds){
        sound=newSounds;
    }

    public void display(){
        System.out.println();
        System.out.println("Animals Name:Cat");
        System.out.println("Sound :"+sound);
    }
}
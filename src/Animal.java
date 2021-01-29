import java.util.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.util.Collection;

public class Animal {
    public String name;
    public int size;

    public void voice(int size) {
        if (size > 7)
            System.out.println("Making loud sound!");
        else
            System.out.println("Making sound!");
    }

    public static void main(String[] args) throws Exception {
        Animal[] animals = new Animal[2];

        animals[0] = new Cat("murka", 7);
        animals[1] = new Dog("sharik", 10);

        for (Animal a : animals) {
            a.voice(a.size);
        }
    }

    //interface can have variables, but public static final
    interface Test {
        int l = 1;

    }


    static class Cat extends Animal{

        public Cat(String n, int s) {
            name = n;
            size = s;
        }

        // no overriding
        public void voice(long s) {
            System.out.println("Meow!");
        }

        public void scratch() {
            System.out.println("Here you go big moving leg!");
        }
    }

    static class Dog extends Animal{

        public Dog(String n, int s) {
            name = n;
            size = s;
        }

        //proper overriding
        @Override
        public void voice(int size) {
            System.out.println("Woof!");
        }

        public void guard() {
            System.out.println("Watching after my Pedigree bag");
        }
    }


}


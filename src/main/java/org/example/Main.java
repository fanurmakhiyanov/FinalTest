package org.example;

import java.util.Scanner;

import org.example.Pets.Cat;
import org.example.Pets.Dog;
import org.example.Beasts.Camel;
import org.example.Beasts.Donkey;

public class Main {
    public static void main(String[] args) {

        Farm<Animal> animalFarm = new Farm<>();

        animalFarm.adopt(new Cat(1001, "Лися", "2016-10-13", true));
        animalFarm.adopt(new Donkey(1002, "Алдар", "2014-05-12", 12));
        animalFarm.adopt(new Camel(1003, "Агата", "2014-05-12", 15));
        animalFarm.adopt(new Dog(1004, "Шарик", "2021-04-07", false));

        try {
            while (true) {

                Menu.showMainMenu();
                try (
                        Scanner sc = new Scanner(System.in)) {
                    int i = sc.nextInt();
                    switch (i) {
                        case 1:
                            Farm.printAnimals();
                            break;
                        case 2:
                            Menu.printOnlyThisClass(animalFarm);
                            break;
                        case 3:
                            Menu.Comands();
                            break;
                        case 4:
                            Menu.newComand();
                            break;
                        case 5:
                            Menu.newAnimal();
                            break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Try one more time");
        }
    }
}
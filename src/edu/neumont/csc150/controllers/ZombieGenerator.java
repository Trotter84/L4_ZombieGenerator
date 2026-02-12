package edu.neumont.csc150.controllers;

import edu.neumont.csc150.models.*;
import edu.neumont.csc150.views.ZombieUI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ZombieGenerator {
    private Random random = new Random();
    private List<Zombie> zombies;
    private ZombieUI zombieUI;

    public ZombieGenerator() {
        zombieUI = new ZombieUI();
        zombies = new ArrayList<>();
    }

    public void run() {
        mainMenuController();
    }

    public void mainMenuController() {

        do {
            int selection = zombieUI.mainMenu();
            switch (selection) {
                case 1 -> generateOneZombie();
                case 2 -> generateSomeZombies();
                case 3 -> generateNZombies(zombieUI.promptForQuantity());
                case 4 -> {
                    zombieUI.exitMessage();
                    return;
                }
            }
            printZombies();
            clearZombies();
        } while (true);
    }

    private void generateOneZombie() {
        generateZombie();
    }

    private void generateSomeZombies() {
        for (int i = 0; i < random.nextInt(11); i++) {
            generateZombie();
        }
    }

    private void generateNZombies(int qty) throws IllegalArgumentException {
        if (qty < 1) {
            throw new IllegalArgumentException("Enter a number greater than 0");
        }
        for (int i = 0; i < qty; i++) {
            generateZombie();
        }
    }

    private void generateZombie() {
        switch (random.nextInt(3)) {
            case 0 -> zombies.add(new Walker());
            case 1 -> zombies.add(new Runner());
            case 2 -> zombies.add(new Tank());
        }
    }

    private void clearZombies() {
        zombies.clear();
    }

    private void printZombies() {
        for (Zombie zombie : zombies) {
            zombie.attack(zombie.roll(1, 20));
            zombieUI.displayZombie(zombie, zombie.getAttack());
        }
    }
}

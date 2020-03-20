package com.tiven.questy.OOPPolymorphism;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ": " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n"); // movie.plot() <--- here comes Polymorphism
            Movie movie1= new Jaws();
            System.out.println(movie1.plot());
        }

    }

    public static Movie randomMovie() {
        int randomNUmber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was " + randomNUmber);

        switch (randomNUmber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();

        }
        return null;
    }

}

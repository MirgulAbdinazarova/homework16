public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Shark shark=new Shark();
        Turtle turtle = new Turtle();
        Eagle eagle = new Eagle();

        Animal[]animals={animal,shark,turtle,eagle};
             for (Animal i:animals){
                  if (i.getClass().getSimpleName().equals("Animal")){
                      i.eat();
                  } else if (i.getClass().getSimpleName().equals("Shark")) {
                    shark.attack();
                  } else if (i.getClass().getSimpleName().equals("Turtle")) {
                      turtle.swim();
                  } else if (eagle instanceof Eagle) {
                      eagle.fly();
                  }
             }
             Shark[]sharks={shark};
             Turtle[]turtles={turtle};
             Eagle[]eagles={eagle};

    }

}
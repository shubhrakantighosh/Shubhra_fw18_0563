class Main extends Animal{
    public static void main(String[] args){
        Animal [] array=new Animal[3];
        array[0]=new Dog();
        array[1]=new Cat();
        array[2]=new Tiger();

        for (Animal animal : array) {
            animal.makeNoise();
            animal.eat();
            animal.walk();
        }
    }
}

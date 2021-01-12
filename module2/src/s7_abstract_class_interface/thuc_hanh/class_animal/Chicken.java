package s7_abstract_class_interface.thuc_hanh.class_animal;

public class Chicken extends Animals implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: Gâu Gâu";
    }

    @Override
    public String howToEat() {
        return "Chicken Eat rice";
    }
}

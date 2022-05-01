package JavaFaker;

import com.github.javafaker.Faker;

public class PracticeFaker {
    public static void main(String[] args) {
        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        int age = faker.number().numberBetween(18,98);
        String address = faker.address().fullAddress();
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(address);






    }
}

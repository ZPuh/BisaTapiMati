package Mei2024;

public class Tgl10B {

    public static void main(String[] args) {
        // Input :
        // Array 2 Dimensi Bertipe Object berisi Class
        
        // Output : 
        // String yang merepresentasikan setiap elemen dalam array tersebut dalam format yang sesuai dengan jenis objeknya, 
        // dan setiap baris dari array utama dipisahkan oleh newline (\n).
        
        Object[][] objects = {
            {new Person("John", 25), new Dog("Buddy")},
            {new Car("Toyota"), new Person("Alice", 30)},
            {new Dog("Max"), new Car("Honda")}
        };

        System.out.println(printArray(objects));

    }

    public static String printArray(Object[][] array) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] instanceof Person) {
                    result.append(((Person) array[i][j]).toString());
                } else if (array[i][j] instanceof Dog) {
                    result.append(((Dog) array[i][j]).toString());
                } else if (array[i][j] instanceof Car) {
                    result.append(((Car) array[i][j]).toString());
                }

                if (j != array[i].length - 1) {
                    result.append(", ");
                }
            }
            if (i != array.length - 1) {
                result.append("\n");
            }
        }
        return result.toString();
    }
}

// Class Person
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

// Class Dog
public class Dog {
private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{name='" + name + "'}";
    }
}

// Class Car
public class Car {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{brand='" + brand + "'}";
    }
}

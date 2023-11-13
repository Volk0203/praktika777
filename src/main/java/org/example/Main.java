import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class User {
    private String name;
    private Integer age;
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return name + ", возраст " + age + " лет";
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите имя пользователя:");
            String name = scanner.nextLine();
            System.out.println("Введите возраст пользователя:");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consuming the new line character
            User user = new User(name, age);
            userList.add(user);
        }
        Collections.sort(userList, Comparator.comparing(User::getAge));
        System.out.println("Список пользователей:");
        for (User user : userList) {
            System.out.println(user.toString());
        }
    }
}

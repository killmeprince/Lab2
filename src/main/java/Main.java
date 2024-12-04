import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User(1, "Smith", "John", 25, "USA"),
                new User(2, "Doe", "Jane", 30, "UK"),
                new User(3, "Brown", "Bob", 28, "Canada"),
                new User(4, "White", "Alice", 22, "USA")
        );

        System.out.println("Users sorted by last name:");
        UserService.showUsersByLastName(users);
        System.out.println("\nUsers sorted by age:");
        UserService.showUsersByAge(users);
        System.out.println("\nAre all users older than 7?");
        System.out.println(UserService.ageChecker(users));
        System.out.println("\nAverage age of users:");
        System.out.println(UserService.calculateUsersByAge(users));
        System.out.println("\nNumber of unique countries:");
        UserService.uniqueCountries(users);

    }
}

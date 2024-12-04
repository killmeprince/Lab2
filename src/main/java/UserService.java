import java.util.Comparator;
import java.util.List;

public class UserService {
    public static void showUsersByLastName(List<User> users) {
        users.stream()
                .sorted(Comparator.comparing(User::lastName))
                .forEach(System.out::println);
    }
    public static void showUsersByAge(List<User> users) {
        users.stream()
                .sorted(Comparator.comparing(User::age))
                .forEach(System.out::println);
    }
    public static boolean ageChecker(List<User> users) {
        return users.stream()
                .allMatch(user -> user.age() > 7 );
    }
    public static double calculateUsersByAge(List<User> users) {
        return users.stream()
                .mapToInt(User::age)
                .average().orElse(0.0);
    }
    public static void uniqueCountries(List<User> users) {
        long a = users.stream()
                .map(User::country)
                .distinct().count();
        System.out.println(a);
    }
}

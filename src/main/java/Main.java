import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*


        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        int randomInt = 0;


        for (int i = 0; i < 20; i++) {
            users.add(new User(random.nextInt(), stringBuilder.append(randomInt).toString(), stringBuilder.append(randomInt).toString(), random.nextInt(), "CountryName" + random.nextInt()));
        }
        */
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Smith", "John", 25, "USA"));
        users.add(new User(2, "Doe", "Jane", 30, "UK"));
        users.add(new User(3, "Brown", "Bob", 28, "Canada"));
        users.add(new User(4, "White", "Alice", 22, "USA"));

        User user = new User(0, "", "", 8, "");


        user.showAllUsers(users);
        System.out.println();
        user.showUserByLastName(users);
        user.showUserByAge(users);
        user.averageAge(users);
        user.differentCountries(users);







    }
}

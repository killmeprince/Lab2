import java.util.HashSet;
import java.util.List;
import java.util.Set;

public record User(int id, String lastName, String firstName, int age, String country) {

    public User(int id, String lastName, String firstName, int age, String country) {
        //task3
        if (age < 7) {

            throw new IllegalArgumentException("The user is too young");
        } else {
            this.age = age;
        }
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.country = country;

    }
// prosto tak
    public void showAllUsers(List<User> users) {
        for (User user : users) {
            System.out.println(user);
        }
    }
//1 task
    public void showUserByLastName(List<User> users) {
        users.forEach(user -> {
            System.out.println("Last Name is: " + user.lastName);
        });
    }
//2
    public void showUserByAge(List<User> users) {
        users.forEach(user -> {
            System.out.println("Age is: " + user.age);
        });
    }
    //4
    public void averageAge(List<User> users) {
        int totalAge = users.stream().mapToInt(user -> user.age).sum();
        System.out.println("total age is: " + totalAge / users.size());
    }
    //pobednaya
    public void differentCountries(List<User> users) {
         Set<String> uniqueCountries = new HashSet<>();

         users.forEach(user -> {
             uniqueCountries.add(user.country);
         });
        System.out.println("Number of unique countries is:"+ uniqueCountries.size() );
    }

}

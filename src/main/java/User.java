public record User(int id, String lastName, String firstName, int age, String country) {
    public User {
        if (age <= 7) {
            throw new IllegalArgumentException("The user is too young");
        }
    }

}

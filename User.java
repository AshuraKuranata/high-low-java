class User {
    String fullName;
    String firstName;
    String lastName;
    int games = 0;
    int wins = 0;
    int losses = 0;
    int winstreak = 0;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }

    public String getFullName() {
        return fullName;
    }
}

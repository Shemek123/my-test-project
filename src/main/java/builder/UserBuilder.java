package builder;

import com.github.javafaker.Faker;
import model.User;

public class UserBuilder {

    private String username;
    private String password;
    private String email;

    private static final Faker faker = new Faker();

    public UserBuilder withUsername(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public User build() {
        if (username == null) {
            username = faker.name().username();
        }
        if (password == null) {
            password = faker.internet().password(6, 12);
        }
        if (email == null) {
            email = faker.internet().emailAddress();
        }
        return new User(username, password, email);
    }
}

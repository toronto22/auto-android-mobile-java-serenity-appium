package io.github.toronto22.automation.data;

import io.github.toronto22.automation.model.User;

public class UserInformation {
    public static User validUser = new User("standard_user","secret_sauce");
    public static User invalidUser = new User("invalid","secret_sauce");
    public static User torontoUser = new User("standard_user","secret_sauce","toronto","toronto22","10000");
}

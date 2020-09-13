package com.vu.app.ws.ui.model.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UpdateUserDetailsRequestModel {

    @NotNull(message = "First name cannot be empty !")
    @Size(min = 2, message = "firstName must be equal or greater than 2 characters !")
    private String firstName;

    @NotNull(message = "Last name cannot be empty !")
    @Size(min = 2, message = "lastName must be equal or greater than 2 characters !")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

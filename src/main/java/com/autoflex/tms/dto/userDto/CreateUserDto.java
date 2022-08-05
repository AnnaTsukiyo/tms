package com.autoflex.tms.dto.userDto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

public final class CreateUserDto {

    @NotNull(message = "Full name cannot be null")
    private final String fullName;
    @Email
    private final String email;
    @Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,20})")
    private final String password;
    @NotNull(message = "Role cannot be null")
    private final String role;
    @NotNull(message = "Is active cannot be null")
    private final String isActive;
    @PastOrPresent
    private final String created;
    @PastOrPresent
    private final String updated;

    public CreateUserDto(String fullName, String email, String password, String role, String isActive, String created, String updated) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.isActive = isActive;
        this.created = created;
        this.updated = updated;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getIsActive() {
        return isActive;
    }

    public String getCreated() {
        return created;
    }

    public String getUpdated() {
        return updated;
    }

    @Override
    public String toString() {
        return "CreateUserDto{" +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", isActive='" + isActive + '\'' +
                ", created='" + created + '\'' +
                ", updated='" + updated + '\'' +
                '}';
    }
}

package cn.avicted.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @ClassName Spitter
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/13/013 9:14
 * @Version 1.0
 **/
public class Spitter {
    private Long id;

    @NotNull
    @Size(min=5, max=16)
    private String firstName;

    @NotNull
    @Size(min=5, max=25)
    private String lastName;

    @NotNull
    @Size(min=2, max=30)
    private String userName;

    @NotNull
    @Size(min=2, max=30)
    private String password;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "First Name is " + firstName + " Last Name is " + lastName + " User Name is " + userName + "密码是：" + password;
    }


}

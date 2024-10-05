package pkg23549009002;
abstract class UserType {
    protected String name;
    protected String password;
    protected String email;
    protected String accountType;
    UserType()  {
        this.name = "No Name";
        this.email= "No Email";
        this.password = "No Password";
        this.accountType = "Not Defined";
    }
    UserType(String name, String email,String password,String accountType)  {
        this.name = name;
        this.email=email;
        this.password = password;
        this.accountType = accountType;
    }
    abstract void setName(String name);
    abstract void setPassword(String password);
    abstract void setEmail(String email);
    abstract void setType(String accountType);
    abstract String getName();
    abstract String getPassword();
    abstract String getEmail();
}

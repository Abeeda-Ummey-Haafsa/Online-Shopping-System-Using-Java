package pkg23549009002;
public class Admin extends UserType{
    public Admin(String name, String email, String password, String accountType) 
    {
        super(name, email, password, accountType);
    }
    
    @Override
    void setName(String name) {this.name = name; }
    @Override
    void setPassword(String password) { this.password = password; }
    @Override
    void setEmail(String email) {  this.email = email;  }
    @Override
    void setType(String accountType) {  this.accountType = accountType; }
    @Override
    String getName() {  return name;  }
    @Override
    String getPassword() {  return password;  }
    @Override
    String getEmail() {  return email;  }
}

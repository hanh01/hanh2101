package Java2_08;


public class Users {
    private int id;
    private String username;
    private String password;
    private int role;

    public Users(){};
    public Users(String username,String password){
        this.password =password;
        this.username = username;
    }
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public int getRole(){
        return this.role;
    }
    public void setRole(int role){
        this.role = role;
    }

    @Override
    public String toString() {
        return "Users{" +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }

}

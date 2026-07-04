// import bank;
class Account{
    public String name;
    protected String email; //only accessible to current file and subclasses of other files(via package)
    private String password;

    //to access private things we will use getter(get info) and setter(set)
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String pass){
        this.password = pass;
    }
}
public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Apna Clg";
        account1.email = "xyz@gmail.com";
        // account1.pass = "123"; //not accessible
        account1.setPassword("abc@123");
        System.out.println(account1.getPassword());
    }
}

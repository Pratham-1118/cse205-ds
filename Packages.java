package bank; 
    
class Account{
    public String name;
    protected String email;
    private String password;

    // private objects cannot be accessed in other classes other than this.
    // Hence we use getter and setter for this.
    public String getpass(){
        return this.password;
    }
    public void setpass(String pass);{
        this.password = pass;
    }



}
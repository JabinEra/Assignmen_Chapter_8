package Problem_23;

public class loginForm {

    private String actualUserName = "";
    private String actualPassword = "";
    private String enteredUserName = "";
    private String enteredPassword = "";
    private boolean loggedIn = false;

    // Constructors
    public void LoginForm(String userName, String password)
    {
        this.actualUserName = userName;
        this.actualPassword = password;
    }

    public void input(String text, String input)
    {
        if(text.equals("Username"))
        {
            enteredUserName = input;
        }
        else if(text.equals("Password"))
        {
            enteredPassword = input;
        }
        else
        {
            System.out.println("Something Went Wrong: input");
        }
    }
    public void click(String button) {
        if (button.equals("Submit")) {
            // Check if the entered values are the correct ones
            if (enteredUserName.equals(actualUserName) && enteredPassword.equals(actualPassword)) {
                loggedIn = true;
            } else {
                loggedIn = false;
            }
        } else if (button.equals("Reset")) {
            enteredUserName = "";
            enteredPassword = "";
        } else {
            System.out.println("Something Went Wrong: click");
        }


    }
    public boolean loggedIn()
    {
        return loggedIn;
    }
}

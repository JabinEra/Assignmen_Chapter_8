package Problem_23;

import java.util.Scanner;

public class loginFormTester {
    public static <LoginForm> void main(String[] args)
    {
        LoginForm form = new LoginForm("mayuresh_95", "LoveCoding_95");
        Scanner in = new Scanner(System.in);

        while(!form.loggedIn())
        {
            System.out.println("Login Form");

            System.out.print("Enter Username: ");
            String userName = in.next();
            form.input("Username", userName);

            System.out.print("Enter Password: ");
            String password = in.next();

            form.input("Password", password);

            // Click "Submit"
            form.click("Submit");
        }
        System.out.println("Login Successfull");

        in.close();

}

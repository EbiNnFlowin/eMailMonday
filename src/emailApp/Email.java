package emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
   private String lastName;
   private String password;
   private String email;
    private String department;
    private int defaultPasswordLength = 7;
    private int mailboxCapacity;
   private String alternateEmail;
   private String companySuffix = "computermentors.org";




    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("Email Created" + this.firstName + " "+ this.lastName);
        this.department = setDepartment();
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Department: "+ this.department);
        System.out.println("Your password is: " + this.password);
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() +"@."+ companySuffix;
        System.out.println("Your email is "+ email);

    }
    private  String setDepartment(){
        System.out.print("Enter the department:\n1 for Sales\n2 for Instructors\n3 for Technology\n4 for Office\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1){
            return "sales";
        } else if (depChoice == 2) {
            return "Instructors";
        } else if (depChoice == 3) {
            return "Technology";
        } else if (depChoice == 4) {
            return "Technology";
        } else {
            return "";
        }

    }
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPKRSTUWXYZ0123456789!!#@$";
        char [] password= new char[length];
        for (int i =0; i <length;i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);

    }
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
    public void setAlternateEmail(String altEMail){
        this.alternateEmail = altEMail;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public void changePassword(String password){
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }

    }




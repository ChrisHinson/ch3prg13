import java.util.Scanner;

public class userInput
{
    Scanner keyboard = new Scanner(System.in);

    public String getPlan()
    {
        Boolean validInput = null;
        String plan;

        System.out.println("Please enter your subscription level \n A, B, or C");
        plan = keyboard.nextLine();

        while (validInput != Boolean.TRUE)
        {

            if (validate.validString(plan, "(?i)[ABC]") == Boolean.TRUE) {
                plan = plan.toUpperCase();
                System.out.println("Ok, thank you class " +  plan + " customer");
                validInput = Boolean.TRUE;
            } else {
                System.out.println("Sorry, that's not a valid subscription plan, please try again");
                plan = keyboard.nextLine();
            }
        }
        return plan;
    }

    public int getHours()
    {
        int hours = -1;

        do {
            System.out.println("Please enter the amount of hours you have used this month.");
            if (keyboard.hasNextInt()) {
                hours = keyboard.nextInt();
            } else {
                System.out.println("That's not a valid number of hours please try again");

            }
        } while (hours < 0);


        return hours;
    }

    public Boolean overCharge(String bracket, int hours)
    {
        Boolean inputValidated = Boolean.FALSE;
        Boolean overcharge;
        String plan = bracket;

                if (plan.matches("A")) {
                    if (hours > 10) {
                        System.out.println("You have gone over your plan's allotted hours per month, overage rates are $2 per hour");
                        overcharge =  Boolean.TRUE;
                    } else {
                        overcharge =  Boolean.FALSE;
                    }
                } else if (plan.matches("B")) {
                    if (hours > 20) {
                        System.out.println("You have gone over your plan's allotted hours per month, overage rates are $1 per hour");
                        overcharge = Boolean.TRUE;
                    } else {
                        overcharge = Boolean.FALSE;
                    }
                } else {
                    overcharge = Boolean.FALSE;
                }
        return overcharge;
    }
    }


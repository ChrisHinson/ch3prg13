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

            do {
                if (validate.validString(plan, "(?i)[ABC]") == Boolean.TRUE) {
                    plan = plan.toUpperCase();
                    System.out.println("Ok, thank you class " + plan + " customer");
                    validInput = Boolean.TRUE;
                } else {
                    System.out.println("Sorry, that's not a valid subscription plan, please try again");
                    plan = keyboard.nextLine();
                }
            }
            while (validInput != Boolean.TRUE);


        return plan;
    }

    public int getHours()
    {
        Boolean validated = Boolean.FALSE;
        int hours;

        do {
            System.out.println("Please enter the amount of hours you have used this month.");

            while (!keyboard.hasNextInt())
            {
                System.out.println("Sorry, that's not a valid number, please try again");
                keyboard.next();
            }
            hours = keyboard.nextInt();
            validated = Boolean.TRUE;
        } while (!validated);


        return hours;
    }

    public Boolean overCharge(String bracket, int hours)
    {
        Boolean inputValidated = Boolean.FALSE;
        Boolean overcharge;
        String plan = bracket;

        if (plan.matches("A"))
        {
                    if (hours > 10) {
                        System.out.println("You have gone over your plan's allotted hours per month, overage rates are $2 per hour");
                        overcharge =  Boolean.TRUE;
                    } else {
                        overcharge =  Boolean.FALSE;
                    }
        } else if (plan.matches("B"))
        {
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


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

    public double baseCharge(String bracket, int hours)
    {
        double baseCharge = 0.00;

        if (bracket.matches("A"))
        {
            baseCharge = 9.95;
        }
        else if (bracket.matches("B"))
        {
            baseCharge = 13.95;
        }
        else if (bracket.matches("C"))
        {
            baseCharge = 19.95;
        }
        return baseCharge;
    }

    public double overCharge(String bracket, int hours)
    {
        Boolean inputValidated = Boolean.FALSE;
        double overchargeAmount = 0.00;
        String plan = bracket;

        if (plan.matches("A"))
        {
            if (hours > 10)
            {
                System.out.println("You have gone over your plan's allotted hours per month, overage rates are $2 per hour");
                overchargeAmount = (hours-10) * 2.00;
                System.out.println("You have been charged an additional $" + overchargeAmount);
            }
            else
            {
                System.out.println("You have stayed under your allotted hours for the month, you will not face any additional charges");
                overchargeAmount = 0.00;
            }
        }
        else if (plan.matches("B"))
        {
            if (hours > 20) {
                System.out.println("You have gone over your plan's allotted hours per month, overage rates are $1 per hour");
                overchargeAmount = (hours-20) * 2.00;
                System.out.println("You have been charged an additional $" + overchargeAmount);
            }
            else
            {
                System.out.println("You have stayed under your allotted hours for the month, you will not face any additional charges");
                overchargeAmount = 0.00;
            }
        }
        else if (plan.matches("C"))
        {
            overchargeAmount = 0.00;
        }

        return overchargeAmount;
    }
}


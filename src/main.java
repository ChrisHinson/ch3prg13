public class main
{
    public static void main(String[] args)
    {
        userInput in = new userInput();

        String plan;
        int hours;
        double overcharge;
        double basecharge;
        double totalCharge;

        plan = in.getPlan();
        hours = in.getHours();

        basecharge = in.baseCharge(plan, hours);
        overcharge = in.overCharge(plan, hours);

        totalCharge = basecharge + overcharge;

        System.out.println("You total charge for the month is $" + totalCharge + "\nThank you for choosing GreatISP.");
    }
}

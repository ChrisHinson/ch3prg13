public class main
{
    public static void main(String[] args)
    {
        userInput in = new userInput();

        String plan;
        int hours;
        Boolean overcharge;

        plan = in.getPlan();
        hours = in.getHours();

        overcharge = in.overCharge(plan, hours);

    }
}

public class LamdasAndLambdonts implements Lambduh, Lambdont {

    @Override
    public String check(boolean isLamb) {
        if (isLamb){
            return "This is a lamb duh!";
        }

        return "This is not a lamb duh!";
    }

    @Override
    public String test(String lamb) {
        return "This name is " + lamb;
    }
}

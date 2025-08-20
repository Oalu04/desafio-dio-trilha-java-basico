public class Main {
    public static void main(String[] args) throws Exception {
        Clock brClock = new BRLClock();
        brClock.setSecond(0);
        brClock.setMinute(0);
        brClock.setHour(25);

        System.out.println(brClock.getTime());

        System.out.println(new USClock().convert(brClock).getTime());
    }
}

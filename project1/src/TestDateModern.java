public class TestDateModern {
    public static void main(String[] args) {
        DateModern d1 = new DateModern(2025, 02, 8);
        System.out.println("Original Date: " + d1);

        DateModern d2 = new DateModern(2012, 12, 23);
        System.out.println("New Date (from chain): " + d2);
        System.out.println("Yeat is "+ d2.getYear());
        System.out.println("Month is "+ d2.getMonth());
        System.out.println("Day is "+ d2.getDay());

        System.out.println("Original Date is still: " + d1);

    }
}

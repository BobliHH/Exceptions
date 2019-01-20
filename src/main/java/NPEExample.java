public class NPEExample {
    public static void main(String[] args) {
        Integer a = null;
        try {
            a.toString();
        } catch (NullPointerException e) {
            System.out.println("1321");
        }

    }
}


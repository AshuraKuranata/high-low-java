public class Number {
    int current;
    int next;

    public static int numberRandomizer() {
        int random = (int)(Math.random() * 100) + 1;
        return random;
    };

    public Number() {
        boolean confirm = true;
        while (confirm == true) {
            current = numberRandomizer();
            next = numberRandomizer();
            if (next == current) {
                next = numberRandomizer();
            } else {
                confirm = false;
            };
        };
    };
}

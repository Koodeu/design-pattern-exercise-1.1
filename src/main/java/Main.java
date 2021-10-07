public class Main {
    public static void main(String[] args) {
//        Burger classicBurger = new Burger(BreadType.BRIOCHE, MeatType.MEAT, Sauce.CLASSIC, true, true, false, false, false, true, true, false);
//        Burger vegeBurger = new Burger(BreadType.BRIOCHE, MeatType.VEGE, Sauce.HONEY_MUSTARD, true, true, true, true, false, false, true, true);
//
//        System.out.println(classicBurger);
//        System.out.println(vegeBurger);

        Burger megaBurger = new Burger.BurgerBuilder(BreadType.BRIOCHE, MeatType.MEAT, Sauce.SPICY)
                .withBacon(true)
                .withCheese(true)
                .withJalapeno(true)
                .withOnion(true)
                .withPineapple(true)
                .withTomato(true)
                .withLettuce(true)
                .withPickle(true)
                .build();

        System.out.println(megaBurger.toString());
    }
}

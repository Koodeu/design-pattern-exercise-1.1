public class Burger {
    private BreadType breadType;
    private MeatType meatType;
    private Sauce sauce;
    private boolean cheese;
    private boolean jalapeno;
    private boolean tomato;
    private boolean lettuce;
    private boolean pickle;
    private boolean bacon;
    private boolean onion;
    private boolean pineapple;

    public Burger(BreadType breadType, MeatType meatType, Sauce sauce) {
        this.breadType = breadType;
        this.meatType = meatType;
        this.sauce = sauce;
    }

    public Burger(BreadType breadType, MeatType meatType, Sauce sauce, boolean cheese, boolean jalapeno, boolean tomato, boolean lettuce, boolean pickle, boolean bacon, boolean onion, boolean pineapple) {
        this.breadType = breadType;
        this.meatType = meatType;
        this.sauce = sauce;
        this.cheese = cheese;
        this.jalapeno = jalapeno;
        this.tomato = tomato;
        this.lettuce = lettuce;
        this.pickle = pickle;
        this.bacon = bacon;
        this.onion = onion;
        this.pineapple = pineapple;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }

    public MeatType getMeatType() {
        return meatType;
    }

    public void setMeatType(MeatType meatType) {
        this.meatType = meatType;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isJalapeno() {
        return jalapeno;
    }

    public void setJalapeno(boolean jalapeno) {
        this.jalapeno = jalapeno;
    }

    public boolean isTomato() {
        return tomato;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public boolean isPickle() {
        return pickle;
    }

    public void setPickle(boolean pickle) {
        this.pickle = pickle;
    }

    public boolean isBacon() {
        return bacon;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public boolean isOnion() {
        return onion;
    }

    public void setOnion(boolean onion) {
        this.onion = onion;
    }

    public boolean isPineapple() {
        return pineapple;
    }

    public void setPineapple(boolean pineapple) {
        this.pineapple = pineapple;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "breadType=" + breadType +
                ", meatType=" + meatType +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", jalapeno=" + jalapeno +
                ", tomato=" + tomato +
                ", lettuce=" + lettuce +
                ", pickle=" + pickle +
                ", bacon=" + bacon +
                ", onion=" + onion +
                ", pineapple=" + pineapple +
                '}';
    }




    public  Burger(BurgerBuilder BurgerBuilder){
        this.cheese= BurgerBuilder.cheese;
        this.jalapeno= BurgerBuilder.jalapeno;
        this.tomato= BurgerBuilder.tomato;
        this.lettuce= BurgerBuilder.lettuce;
        this.pickle= BurgerBuilder.pickle;
        this.bacon= BurgerBuilder.bacon;
        this.onion= BurgerBuilder.onion;
        this.pineapple= BurgerBuilder.pineapple;

    }

    public static class BurgerBuilder{

        private BreadType breadType;
        private MeatType meatType;
        private Sauce sauce;
        private boolean cheese;
        private boolean jalapeno;
        private boolean tomato;
        private boolean lettuce;
        private boolean pickle;
        private boolean bacon;
        private boolean onion;
        private boolean pineapple;


        public BurgerBuilder(final BreadType breadType, final MeatType meatType, final Sauce sauce) {
            this.meatType = meatType;
            this.breadType = breadType;
            this.sauce = sauce;
        }

        public BurgerBuilder withCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public BurgerBuilder withJalapeno(boolean jalapeno) {
            this.jalapeno = jalapeno;
            return this;
        }

        public BurgerBuilder withTomato(boolean tomato) {
            this.tomato = tomato;
            return this;
        }

        public BurgerBuilder withLettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public BurgerBuilder withPickle(boolean pickle) {
            this.pickle = pickle;
            return this;
        }

        public BurgerBuilder withBacon(boolean bacon) {
            this.bacon = bacon;
            return this;
        }

        public BurgerBuilder withOnion(boolean onion) {
            this.onion = onion;
            return this;
        }

        public BurgerBuilder withPineapple(boolean pineapple) {
            this.pineapple = pineapple;
            return this;
        }

        public Burger build(){
            return new Burger(this);
        }


    }


}

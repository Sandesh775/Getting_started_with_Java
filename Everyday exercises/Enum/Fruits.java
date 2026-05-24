public enum Fruits {
    Mango(60),
    Apple(30),
    Litchi(80),
    Papaya;

    private int levelOfSweetness;
    // default

    Fruits() {
        // either we can set default value
    }

    // parameterized
    private Fruits(int levelOfSweetness){
        this.levelOfSweetness = levelOfSweetness;
    }

    // getter

    public int getLevelOfSweetness() {
        return levelOfSweetness;
    }
}
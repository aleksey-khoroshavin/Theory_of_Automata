package expression;

public class Concatenation implements Word{
    private final Word s1;
    private final Word s2;

    public Concatenation(Word s1, Word s2){
        this.s1 = s1;
        this.s2 = s2;
    }

    public Word getS1() {
        return s1;
    }

    public Word getS2() {
        return s2;
    }

    @Override
    public String toString() {
        return "concat(" + s1.toString() + " , " + s2.toString() + ")";
    }
}

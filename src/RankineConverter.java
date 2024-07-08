public class RankineConverter implements Converter {
    @Override
    public double convert(double celsius) {
        return celsius * 9/5 + 491.67;
    }
}

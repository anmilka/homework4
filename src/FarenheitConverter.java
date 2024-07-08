public class FarenheitConverter implements Converter {
    @Override
    public double convert(double celsius) {
        return celsius * 9/5 + 32;
    }
}

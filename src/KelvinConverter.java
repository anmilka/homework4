public class KelvinConverter implements Converter {
    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }
}

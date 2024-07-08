public class BaseConverter {
    void process (double data, Converter converter){
        double result = converter.convert(data);
        System.out.println("Converted value: " + result);
    }

}

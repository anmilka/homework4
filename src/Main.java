public class Main {
    public static void main(String[] args) {

        BaseConverter baseConverter1 = new BaseConverter();
        KelvinConverter converter1 = new KelvinConverter();
        baseConverter1.process(28,converter1);

        BaseConverter baseConverter2 = new BaseConverter();
        FarenheitConverter converter2 = new FarenheitConverter();
        baseConverter2.process(34, converter2);

        BaseConverter baseConverter3 = new BaseConverter();
        RankineConverter converter3 = new RankineConverter();
        baseConverter3.process(56, converter3);
    }
}
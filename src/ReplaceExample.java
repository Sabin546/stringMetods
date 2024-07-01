public class ReplaceExample {
    public static void main(String[] args) {

        String text = "Ana are mere";
        String result = text.replace("a", "*");
        String result2 = text.replace("e", "E");
        System.out.println(result);
        System.out.println(result2);

        String result3 = text.replace("Ana", "Sabin");
        System.out.println(result3);

        String result4 = text.replace("pere", "banane");
        System.out.println(result4);


    }
}

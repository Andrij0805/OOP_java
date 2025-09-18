public class Main
{
    public static void main(String[] args)
    {
        System.out.println("1 .");
        char[] Array = "NLTU IKNIT IPZ-21 software engineering".toCharArray();
        System.out.println(Array);

        System.out.println("2 .");
        String text = new String(Array,0,18);
        System.out.println(text);

        System.out.println("3 .");
        String text1 = new StringBuilder(text).reverse().toString();
        System.out.println(text1);

        System.out.println("4 .");
        String text2 = text.toUpperCase();
        System.out.println(text2);
        System.out.println(text.equals(text2));

        System.out.println("5 .");
        String text3 =text.substring(5,11);
        System.out.println(text3);

        System.out.println("6 .");
        String combined = text + " " + text1;
        System.out.println(combined);

        System.out.println("7 .");
        char letter = 'T';
        int firstIndex = text.indexOf(letter);
        int lastIndex = text.lastIndexOf(letter);
        System.out.println(letter + ": " + firstIndex);
        System.out.println(letter + ": " + lastIndex);

        System.out.println("8 .");
        StringBuffer StringBuffer =new StringBuffer("Martyniuk Andrii Anatoliyovych 08.05.2007");
        System.out.println(StringBuffer);

        System.out.println("9 .");
        StringBuffer.delete(30, 36);
        System.out.println(StringBuffer);

        System.out.println("10 .");
        StringBuffer.append(" Sokal");
        System.out.println(StringBuffer);

        System.out.println("11 .");
        StringBuffer.insert(35, " male");
        System.out.println(StringBuffer);

        System.out.println("12 .");
        System.out.println(StringBuffer.length());
        System.out.println(StringBuffer.toString().getBytes().length);

    }
}
package homeworkFromLesson7;

public class ILikeJava {
    public static void main(String[] args) {
        String string = "I like Java!!!";
        stringLastSymbol(string);
        doesStringEndWith(string, "!!!");
        doesStringStartWith(string, "I like");
        doesStringContainSubstring(string, "Java");
        indexOfSubstring(string, "Java");
        changeAToO(string);
        stringToLowerCase(string);
        stringToUpperCase(string);
        cutSubstring(string, "Java");
    }

    public static void stringLastSymbol(String string) {
        System.out.println("Last symbol of string is '" + string.charAt(string.length() - 1) + "'");
    }

    public static void doesStringEndWith(String string, String ending) {
        String endsOrNot = string.endsWith(ending) ? " ends " : " doesn't end ";
        System.out.println("String" + endsOrNot + "with '" + ending + "'");
    }

    public static void doesStringStartWith(String string, String start) {
        String startsOrNot = string.startsWith("I like") ? " starts " : " doesn't start ";
        System.out.println("String" + startsOrNot + "with '" + start + "'");
    }

    public static void doesStringContainSubstring(String string, String substring) {
        String containsOrNot = string.contains("Java") ? " contains " : " doesn't contain ";
        System.out.println("String" + containsOrNot + "substring '" + substring + "'");
    }

    public static void indexOfSubstring(String string, String substring) {
        System.out.println("Index of substring '" + substring + "' is " + string.indexOf(substring));
    }

    public static void changeAToO(String string) {
        System.out.println(string.replace('a', 'o'));
    }

    public static void stringToLowerCase(String string) {
        System.out.println(string.toLowerCase());
    }

    public static void stringToUpperCase(String string) {
        System.out.println(string.toUpperCase());
    }

    public static void cutSubstring(String string, String substring) {
        System.out.println(string.substring(string.indexOf(substring), string.indexOf(substring) + substring.length()));
    }
}

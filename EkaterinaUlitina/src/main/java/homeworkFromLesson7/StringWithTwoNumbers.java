package homeworkFromLesson7;

public class StringWithTwoNumbers {
    public static void main(String[] args) {
        int firstNum = 3;
        int secondNum = 56;
        System.out.println(useStringBuilder(firstNum, secondNum, '+'));
        System.out.println(useStringBuilder(firstNum, secondNum, '-'));
        System.out.println(useStringBuilder(firstNum, secondNum, '*'));
        changeEqualitySymbolWithInsertAndDelete(useStringBuilder(firstNum, secondNum, '+'));
        changeEqualitySymbolWithReplace(useStringBuilder(firstNum, secondNum, '-'));
    }

    public static StringBuilder useStringBuilder(int firstNum, int secondNum, char action) {
        StringBuilder string1 = new StringBuilder();
        StringBuilder string2 = new StringBuilder();
        StringBuilder string3 = new StringBuilder();
        int result = action == '+' ? firstNum + secondNum : action == '-' ? firstNum - secondNum : firstNum * secondNum;

        return string1.append(firstNum).append(" ").append(action).append(" ").append(secondNum).append(" = ").append(result);
    }

    public static void changeEqualitySymbolWithInsertAndDelete(StringBuilder string) {
        StringBuilder stringWithInsert = string.insert(string.indexOf("="), "равно");
        System.out.println(stringWithInsert.deleteCharAt(string.indexOf("=")));
    }

    public static void changeEqualitySymbolWithReplace(StringBuilder string) {
        System.out.println(string.replace(string.indexOf("="), string.indexOf("=") + 1, "равно"));
    }
}

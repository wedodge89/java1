public class JavaVariables {
    static int memberVar = 123;

    public static void main(String[] args) {
        int twoLine = 2;
        int oneLine = 1;
        int fromExpression = 2 + 3;
        final int finalVar = 10;
        int myVar = getInt();
        int myInnerVar = memberVar + 10;

        System.out.println("twoLine: " + twoLine);
        System.out.println("oneLine: " + oneLine);
        System.out.println("fromExpression: " + fromExpression);
        System.out.println("finalVar: " + finalVar);
        System.out.println("myVar: " + myVar);
        System.out.println("memberVar: " + memberVar);
        System.out.println("myInnerVar: " + myInnerVar);

    }

    public static int getInt() {
        int methodScope = 22;
        return methodScope;
    }
}

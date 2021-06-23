package extension;

/**
 * This demo shows how to call an extension function from a Java class.
 */
public class ExtensionDemo {

    public static void main(String[] args) {
        final String demoString = "abc";
        final char lastChar = MyExtensionsKt.lastChar(demoString);

        System.out.println("lastChar of " + demoString + " is " + lastChar);
    }
}

package java.lang;

/**
 * 因为此类与 java.lang.String 同包，同包，所以引导类为了安全是无法加载的
 *
 * @author Liqc
 * @date 2021/1/4 14:10
 */
public class String {

    static {
        // 永远不会执行
        System.out.println("custom String class");
    }

    public static void main(String[] args) {
        System.out.println("hello custom String class");
        /*
        错误: 在类 java.lang.String 中找不到 main 方法, 请将 main 方法定义为:
           public static void main(String[] args)
        否则 JavaFX 应用程序类必须扩展javafx.application.Application
         */
    }

}

package January19;

public class String类 {
    /**
     * 字符串常见操作
     * 1.字符串比较
     * No       方法名称                                      类型     描述
     * 1.       public boolean equals(Object)               普通     区分大小写
     * 2.       public boolean equalsIgnoreCase(String)     普通     不区分大小
     * 3.       public boolean compareTo(String)            普通     比较大小写关系
     */
    public static void String_compare() {
        System.out.println("\nStringCompare:");
        System.out.println("hello".equals("Hello"));//false
        System.out.println("hello".equalsIgnoreCase("Hello"));//true
        /*
         * compareTo：返回的是一个 int，区分大小关系
         * 不能用依赖这个代码规律
         */
        System.out.println("hello".compareTo("Hello"));
        System.out.println("赵".compareTo("钱"));
    }

    public static void String_contains() {
        System.out.println("\nStringSearch:");
        System.out.println("赵钱孙".contains("钱"));//true
        System.out.println("王周吴郑王".indexOf("王"));//0
        System.out.println("周吴郑王".indexOf("赵"));//-1
        System.out.println("**@@😄".startsWith("**"));
        System.out.println("**@@😄".startsWith("@@", 2));
        System.out.println("**@@😄".endsWith("😄"));
    }

    public static void String_replace() {
        System.out.println("\nStringReplace:");
        System.out.println("赵钱赵".replaceAll("赵", "张三"));
        System.out.println("赵钱赵".replaceFirst("赵", "张三"));
    }

    public static void String_split() {
        System.out.println("\nStringSpilt:");
        String str = "去去去 呜呜呜 呃呃呃";
        String[] result = str.split(" ");// 按照空格拆分
        for (String s : result) {
            System.out.print(s);
        }
        System.out.println();

        String str2 = "去去去 呜呜呜 呃呃呃 日日日";
        String[] result2 = str2.split(" ", 1);
        for (String s : result2) {
            System.out.print(s);
        }
        System.out.println();

        String str3 = "192.168.0.1";
        String[] result3 = str3.split("\\.");//正则表达式：“.”表示任意字符
        for (String s : result3) {
            System.out.print(s);
        }
    }

    public static void String_substring() {
        /*
        索引0开始
        (1,2)==[1,2)
         */
        System.out.println("\nStringSubString:");
        System.out.println("赵钱孙李".substring(2));
        System.out.println("赵钱孙李".substring(1, 2));
    }

    public static void String_others() {
        System.out.println("\nString_others:");
        System.out.println("\n O(∩_∩)O \n (●'◡'●) \n".trim());//保留中间空格
        System.out.println("abc".toUpperCase());
        System.out.println("ABC".toLowerCase());
        System.out.println("abc".intern());//入池
        System.out.println("abc".concat("ABC"));//+，不入池
        System.out.println("abc".length());
        System.out.println(" ".isEmpty());
    }

    public static void String_StringBuilder() {
        /*
        任何的字符串常量都是String对象，而且String的常量一旦声明不可改变，如果改变对象内容，改变的是其引用的指向而已
        通常来讲String的操作比较简单，但是由于String的不可更改特性，为了方便字符串的修改，提供StringBuffer和StringBuilder类
        在String中使用"+"来进行字符串连接，但是这个操作在StringBuffer类中需要更改为append()方法：
         */
        StringBuilder stringBuilder = new StringBuilder("abcdef");
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.delete(0, 2));
        System.out.println(stringBuilder.insert(2, "陈哈哈"));
        System.out.println(stringBuilder.delete(0, 1).insert(2, "嘻嘻"));
    }

    public static void String_StringBuffer() {
        /*
        String_Builder: 线程不安全
        String_Buffer: 线程安全
         */
    }

    public static void main(String[] args) {
        String_compare();
        String_contains();
        String_replace();
        String_split();
        String_substring();
        String_others();
        String_StringBuilder();
    }
}

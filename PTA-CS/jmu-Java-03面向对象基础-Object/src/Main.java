public class Main {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        //这边是你的代码
        java.util.List<Object> dic = new java.util.ArrayList<>(16);
        String cmd, input;
        int inInt;
        double inDouble;
        int n = sc.nextInt();
        for (int i = 0; i < n; ++i) {
            cmd = sc.next();
            switch (cmd) {
                case "c":
                    dic.add(new Computer());
                    break;
                case "s":
                    dic.add(sc.next());
                    break;
                case "d":
                    dic.add(sc.nextDouble());
                    break;
                case "i":
                    dic.add(sc.nextInt());
                    break;
                default:
                    break;
            }
        }
        for (int i = dic.size() - 1; i >= 0; --i) {
            System.out.println(dic.get(i).toString());
        }
        // 代码结束部分
        sc.close();
    }

}

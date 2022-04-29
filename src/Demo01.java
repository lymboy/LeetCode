import org.junit.Test;

public class Demo01 {
    
    @Test
    public void test6() {
        String[] rules = {"F,,3,1,10", "F,3,,3,10"};
        System.out.println(isNormal("F", 3, 6.2, rules));
    }

    /**
     * 判断患者检测结果是否正常
     * @param sex
     * @param age
     * @param result
     * @param relus
     * @return 返回true表示正常，false 表示不正常
     */
    private boolean isNormal(String sex, int age, double result, String[] relus) {
        /**
         * 默认不正常
         */
        boolean normal = false;
        /**
         * 浮点计算误差精度
         */
        double eps = 10e-6;
        for (String rule : relus) {
            String[] args = rule.split(",");
            // 处理输入的规则
            args = resolve(args);
            if (sex.equals(args[0])) {
                if (age >= Integer.valueOf(args[1]) && age < Integer.valueOf(args[2])) {
                    if ((result-Double.valueOf(args[3])>=eps) && (Double.valueOf(args[4]) - result > eps) ) {
                        normal = true;
                        break;
                    }
                }
            }
        }

        return normal;
    }

    /**
     * 处理输入的规则，如果规则存在缺失就填充为相应的数字
     * @param args
     * @return
     */
    private String[] resolve(String[] args) {
        // 如果左边年龄缺失就默认年龄0岁，方便计算
        if ("".equals(args[1])) {
            args[1] = "0";
        }
        // 如果右边年龄缺失就默认年龄无限大，方便计算
        if ("".equals(args[2])) {
            args[2] = "100000000";
        }
        if ("".equals(args[3])) {
            args[3] = "-999999999";
        }
        if ("".equals(args[4])) {
            args[4] = "9999999999";
        }

        return args;
    }
}

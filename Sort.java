import java.util.Scanner;

//输入10个整数，按照从小到大进行排序
public class Sort {

    public static void main(String[] args) {

        // 获取键盘数值
        Scanner s = new Scanner(System.in);
        // 创建一个长度为10的整型数组
        int array[] = new int[5];
        // for循环输入数组
        for (int i = 0; i < array.length; i++) {
            // 输入整数
            System.out.println("请输入第" + (i + 1) + "个数字");
            array[i] = s.nextInt();
        }
        // 使用冒泡排序
        // 外循环选择排序几轮
        for (int i = 0; i < array.length; i++) {
            // 内循环的比较次数是长度-i-1
            for (int j = 0; j < array.length - i - 1; j++) {
                // 如果下标j>j+1（下一个元素）
                if (array[j] > array[j + 1]) {
                    // 则做交换
                    int p = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = p;
                }
            }
        }
        //输出
        for (int i : array) {
            System.out.println(i);
        }
    }

}

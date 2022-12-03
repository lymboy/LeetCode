import java.io.IOException;
import java.net.URLEncoder;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-11-08
 */
public class Demo04 {

    public static void main(String[] args)  {

        String[] files = {
                "1、话题作文（微信：UVOOCCOM）.pdf",
                "10、现象解释型（微信：UVOOCCOM）.pdf",
                "11、议论文之观点列举型（微信：UVOOCCOM）.pdf",
                "12、议论文之利弊型（微信：UVOOCCOM）.pdf",
                "13、议论文之答题型（微信：UVOOCCOM）.pdf",
                "14、议论文之谚语警句型（微信：UVOOCCOM）.pdf",
                "15、问题解决型（微信：UVOOCCOM）.pdf",
                "16、图表型作文（微信：UVOOCCOM）.pdf",
                "17、实用性写作（微信：UVOOCCOM）.pdf",
                "18、对比观点型（微信：UVOOCCOM）.pdf",
                "19、现象说明型（微信：UVOOCCOM）.pdf",
                "2、开头句型（微信：UVOOCCOM）.pdf",
                "20、阐述主题型（微信：UVOOCCOM）.pdf",
                "3、引出不同观点（微信：UVOOCCOM）.pdf",
                "4、得出最终结论（微信：UVOOCCOM）.pdf",
                "5、提出建议（微信：UVOOCCOM）.pdf",
                "6、预示后果（微信：UVOOCCOM）.pdf",
                "7、解决问题（微信：UVOOCCOM）.pdf",
                "8、对比选择型（微信：UVOOCCOM）.pdf",
                "9、说明利弊型（微信：UVOOCCOM）.pdf"
        };

        String dir = "G:\\文档\\四六级历年真题\\英语六级作文模板\\";
        String url = "https://pan.uvooc.com/d/Learn/CET/CET6/英语六级作文模板/";

        for (String filename : files) {
            try {
                System.out.println((url + filename));
                Runtime.getRuntime().exec("curl " + URLEncoder.encode(url + filename) + " -O " + (dir+filename)).waitFor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


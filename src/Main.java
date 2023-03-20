import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * (non-javadoc)
     * 
     * @author zeonghun
     * @since 2023.03.17
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        TraverseDirectory scanDir = new TraverseDirectory();

        List<String> fileList = scanDir.scanDir("/home/jeonghun/test", list);

        for (int i = 0; i < fileList.size(); i++) {
            System.out.println(fileList.get(i));
        }
    }
}
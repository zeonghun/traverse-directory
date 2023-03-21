import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * (non-javadoc)
     * 
     * @author zeonghun
     * @since 2023.03.21
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        TraverseDirectory scanDir = new TraverseDirectory();
        try {
            List<String> fileList = scanDir.scanDir("/home/jeonghun/test", list);
            for (int i = 0; i < fileList.size(); i++) {
                System.out.println(fileList.get(i));
            }
            // path가 잘못된 경로일 때
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}
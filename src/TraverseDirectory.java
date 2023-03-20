import java.io.File;
import java.util.List;

public class TraverseDirectory {
    /**
     * 재귀 호출을 이용하여 하위 디렉토리, 파일 탐색
     * 
     * @param path 하위 순회할 디렉토리의 경로
     * @param fileList 하위 디렉토리, 파일을 추가할 리스트
     * 
     * @return 하위 디렉토리, 파일의 목록
     * 
     * @author zeonghun
     * @since 2023.03.20
     */
    public List<String> scanDir(String path, List<String> fileList) {
        // path 경로 하위에 있는 파일, 디렉토리를 배열로 생성
        File[] files = new File(path).listFiles();
        if ( files.length==0){
            System.out.println("빈 디렉토리 입니다");
        }
        for (File file : files) {
            // fileList에 경로 추가
            fileList.add(file.getPath());
            // 디렉토리면 다시 메소드 호출
            if (file.isDirectory())
                scanDir(file.getPath(), fileList);
        }
        return fileList;
    }
}
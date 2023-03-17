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
     * @since 2023.03.17
     */
    public List<String> scanDir(String path, List<String> fileList) {
        File[] files = new File(path).listFiles(); // path 경로 하위에 있는 파일, 디렉토리를 배열로 생성
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) { // 디렉토리면 다시 메소드 호출
                scanDir(files[i].getPath(), fileList);
            } else { // 파일이면 fileList에 경로 추가
                fileList.add(files[i].getPath());
            }
        }
        return fileList;
    }
}

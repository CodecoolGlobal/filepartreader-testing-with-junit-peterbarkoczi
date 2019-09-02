public class FilePartReader {

    public FilePartReader() {
    }

    public void setup(String filePath, int fromLine, int toLine) {
        if ((toLine < fromLine) || (fromLine < 1)) throw new IllegalArgumentException("Error");
    }

//    public String read() {}

}

package practice2;

public class StarTriangle {
    
    private int width;
    
    public StarTriangle(int width) {
        this.width = width;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("[*]");
            }
        
            if (i < width) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        StarTriangle small = new StarTriangle(3);
        System.out.println(small.toString());
    }
}
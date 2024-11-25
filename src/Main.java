public class Main {
    public static void main(String[] args) {
        Project project = new ProxyProject("google.com");
        project.run();
        project.run();
    }
}

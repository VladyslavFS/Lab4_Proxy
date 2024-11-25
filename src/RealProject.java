class RealProject implements Project {
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("Loading project from " + this.url);
    }

    @Override
    public void run() {
        System.out.println("Running " + this.url);
    }
}

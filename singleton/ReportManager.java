 class ReportManager {
    private static ReportManager instance;

    private ReportManager() {}

    public static ReportManager getInstance() {
        if (instance == null) {
            instance = new ReportManager();
        }
        return instance;
    }

    public void generateAndSendReport(ReportCreator creator, Notifier notifier) {
        Report report = creator.createReport();

        // Decoración (puede ser dinámica)
        Report decorated = new FontDecorator(new ColorDecorator(report));

        decorated.generateContent();
        notifier.send(decorated);
    }
}

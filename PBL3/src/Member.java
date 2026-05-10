public abstract class Member {
    private String name;
    private String major;
    private int generation;
    private String part;

    public Member(String name, String major, int generation, String part) {
        this.name = name;
        this.major = major;
        this.generation = generation;
        this.part = part;
    }

    protected String getName() {
        return name;
    }

    protected String getMajor() {
        return major;
    }

    protected int getGeneration() {
        return generation;
    }

    protected String getPart() {
        return part;
    }

    public abstract SubmissionPolicy getPolicy();

    public abstract String getInfo();

    public boolean canSubmit() {
        return getPolicy().canSubmit();
    }
}

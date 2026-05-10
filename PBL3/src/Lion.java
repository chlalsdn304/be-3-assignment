public class Lion extends Member {
    private int studentId;

    public Lion(String name, String major, int generation, String part, int studentId) {
        super(name, major, generation, part);
        this.studentId = studentId;
    }

    @Override
    public SubmissionPolicy getPolicy() {
        return new LionPolicy();
    }

    @Override
    public String getInfo() {
        return "[아기사자] 이름: " + getName() +
                ", 전공: " + getMajor() +
                ", 기수: " + getGeneration() + "기" +
                ", 파트: " + getPart() +
                ", 학번: " + studentId;
    }
}

class LionPolicy implements SubmissionPolicy {
    @Override
    public boolean canSubmit() {
        return true;
    }
}

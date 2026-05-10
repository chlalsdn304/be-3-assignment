public class Operator extends Member {
    private String position;

    public Operator(String name, String major, int generation, String part, String position) {
        super(name, major, generation, part);
        this.position = position;
    }

    @Override
    public SubmissionPolicy getPolicy() {
        return new OperatorPolicy();
    }

    @Override
    public String getInfo() {
        return "[운영진] 이름: " + getName() +
                ", 전공: " + getMajor() +
                ", 기수: " + getGeneration() + "기" +
                ", 파트: " + getPart() +
                ", 직책: " + position;
    }
}

class OperatorPolicy implements SubmissionPolicy {
    @Override
    public boolean canSubmit() {
        return false;
    }
}

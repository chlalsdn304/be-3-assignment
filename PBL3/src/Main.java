import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 아기사자 정보 입력 ===");
        System.out.print("이름: ");        String lName = sc.nextLine();
        System.out.print("전공: ");        String lMajor = sc.nextLine();
        System.out.print("기수: ");        int lGen = Integer.parseInt(sc.nextLine());
        System.out.print("파트: ");        String lPart = sc.nextLine();
        System.out.print("학번: ");        int studentId = Integer.parseInt(sc.nextLine());

        System.out.println("\n=== 운영진 정보 입력 ===");
        System.out.print("이름: ");        String oName = sc.nextLine();
        System.out.print("전공: ");        String oMajor = sc.nextLine();
        System.out.print("기수: ");        int oGen = Integer.parseInt(sc.nextLine());
        System.out.print("파트: ");        String oPart = sc.nextLine();
        System.out.print("직책: ");        String position = sc.nextLine();
        
        Member lion     = new Lion(lName, lMajor, lGen, lPart, studentId);
        Member operator = new Operator(oName, oMajor, oGen, oPart, position);

        Member[] members = { lion, operator };

        System.out.println("\n=== 등록 결과 ===");
        for (Member m : members) {
            System.out.println(m.getInfo());
            System.out.println("과제 제출 가능 여부: " + (m.canSubmit() ? "가능" : "불가"));
            System.out.println();
        }
    }
}
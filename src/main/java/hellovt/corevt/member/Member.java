package hellovt.corevt.member;

public class Member {
    private Long id;
    private String name;

    private Grade grade;

    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }


    public String toString(Member member) {
        return ("멤버 이름 : " + member.name + " 멤버 아이디: " + member.id + " 멤버 등급: " + member.grade);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

}

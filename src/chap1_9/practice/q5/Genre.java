package chap1_9.practice.q5;

public enum Genre {

    FICTION("소설"),
    NONFICTION("실화"),
    SCIENCE("과학"),
    HISTORY("역사")
    ;

    private final String desc;

    Genre(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}

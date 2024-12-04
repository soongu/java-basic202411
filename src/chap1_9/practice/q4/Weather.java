package chap1_9.practice.q4;

public enum Weather {

    SUNNY("선크림을 바르세요.", "맑음"),
    CLOUDY("우산을 챙기세요.", "흐림"),
    RAINY("비가 오니 우산을 꼭 챙기세요.", "비"),
    SNOWY("따뜻하게 입으세요.", "눈")
    ;

    private final String advice;
    private final String status;

    Weather(String advice, String status) {
        this.advice = advice;
        this.status = status;
    }

    public String getAdvice() {
        return advice;
    }

    public String getStatus() {
        return status;
    }
}

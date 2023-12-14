package src;

public enum Months {
    JANUARY("styczeń"),
    FEBRUARY("luty"),
    MARCH("marzec"),
    APRIL("kweicień"),
    MAY("maj"),
    JUNE("czerwiec"),
    JULY("lipiec"),
    AUGUST("sierpień"),
    SEPTEMBER("wrzesień"),
    OCTOBER("październik"),
    NOVEMBER("listopad"),
    DECEMBER("grudzień");

    private String polish;

    Months(String polish) {
        this.polish = polish;
    }

    public String getPolish() {
        return polish;
    }

    public void setPolish(String polish) {
        this.polish = polish;
    }
}

package ApplicationStudent;

public class Students {
    private String fio;
    private int rating;

    public Students(String fio, int
            rating){
        this.fio = fio;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public String getFio() {
        return fio;
    }
}

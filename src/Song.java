class Song {
    private String title;
    private String artist;
    private int year;
    private String country;

    // 기본 생성자
    public Song() {
    }

    // 모든 필드를 초기화하는 생성자
    public Song(String title, String artist, int year, String country) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }

    // 노래 정보를 출력하는 메소드
    public void show() {
        System.out.println(year + "년 " + country + " 국적의 " + artist + "가 부른 " + title);
    }

    public static void main(String[] args) {
        // 1978년, 스웨덴 국적의 ABBA가 부른 "Dancing Queen"을 나타내는 Song 객체 생성
        Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");

        // 노래 정보 출력
        song.show();
    }
}
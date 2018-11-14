import static java.lang.System.*;
class Music {
    String favorite;
    Music(String favorite) {
        this.favorite = favorite;
    }
    void putData() {
        out.println("My favorite genre of Music is " + favorite);
    }
}

class ConstructorDemo {
    public static void main(String[] args) {
        String[] genreArr = {"Jazz", "Western Classical", "EDMs", "Indian Classical", "Rock"};
        final int SIZE = genreArr.length;
        for(int i = 0; i < SIZE; i++) {
            Music music = new Music(genreArr[i]);
            music.putData();
        }
    }
}
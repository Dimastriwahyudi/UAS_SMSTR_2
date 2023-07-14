import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Film film1 = new Film(1, "The Flash", 2023, 7.3);
        Film film2 = new Film(2, "Spiderman:AS-V", 2023, 9.0);
        Film film3 = new Film(3, "Transformer:ROB", 2023, 6.6);
        Film film4 = new Film(4, "Avatar: TOW", 2022, 7.6);
        Film film5 = new Film(5, "The Little Mermaid", 2023, 7.2);

        Film[] films = {film1, film2, film3, film4, film5};

        FilmEnity filmAnalyzer = new FilmEnity(films);

        System.out.println("Film-film terlaris:");
        filmAnalyzer.tampilkanFilmTerlaris();

        System.out.println("\nFilm-film berdasarkan urutan rating:");
        filmAnalyzer.tampilkanFilmUrutRating();
    }
}

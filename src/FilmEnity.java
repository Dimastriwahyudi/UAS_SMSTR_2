import java.util.Arrays;

public class FilmEnity {
        private Film[] films;

        public FilmEnity(Film[] films) {
            this.films = films;
        }

        public void tampilkanFilmTerlaris() {
            Arrays.sort(films, (film1, film2) -> Double.compare(film2.getRating(), film1.getRating()));
            for (Film film : films) {
                System.out.println("ID Film: " + film.getIdFilm() +
                        "\tNama Film: " + film.getNamaFilm() +
                        "\tTahun: " + film.getTahun() +
                        "\tRating: " + film.getRating());
            }
        }

        public void selectionSort() {
            int n = films.length;
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (films[j].getRating() < films[minIndex].getRating()) {
                        minIndex = j;
                    }
                }
                Film temp = films[i];
                films[i] = films[minIndex];
                films[minIndex] = temp;
            }
        }

        public void tampilkanFilmUrutRating() {
            selectionSort();
            for (Film film : films) {
                System.out.println("ID Film: " + film.getIdFilm() +
                        "\tNama Film: " + film.getNamaFilm() +
                        "\tTahun: " + film.getTahun() +
                        "\tRating: " + film.getRating());
            }
        }
    }



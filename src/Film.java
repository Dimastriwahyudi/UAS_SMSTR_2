 class Film {
        private int idFilm;
        private String namaFilm;
        private int tahun;
        private double rating;

        public Film(int idFilm, String namaFilm, int tahun, double rating) {
            this.idFilm = idFilm;
            this.namaFilm = namaFilm;
            this.tahun = tahun;
            this.rating = rating;
        }

        public int getIdFilm() {
            return idFilm;
        }

        public String getNamaFilm() {
            return namaFilm;
        }

        public int getTahun() {
            return tahun;
        }

        public double getRating() {
            return rating;
        }
    }



package Model;
    public enum AnimalKind {
        DOG ("Собака"),
        CAT ("Кошка"),
        HAMSTER ("Хомяк"),
        HORSE ("Лошадь"),
        CAMEL ("Верблюд"),
        DONKEY ("Осёл");
        private String title;
        AnimalKind(String title) {
            this.title = title;
        }
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

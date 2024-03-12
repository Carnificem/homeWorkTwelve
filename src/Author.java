public class Author {
    private String name;
    private String surname;
    String comparison = name + surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String toString() {
        return "автор:" + this.name + " " + this.surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author that = (Author) o;
        return name.equals(that.name) && surname.equals(that.surname);

    }


    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        result = result + surname.hashCode();
        return result;
    }
}

public class Main {


    public static void main(String[] args) {
        Author viktorPelevin = new Author("Виктор ", "Пелевин ");
        Author grigoriyKlimov = new Author("Григорий ", "Климов");

        Book generationP = new Book("Generation\"П\" ", viktorPelevin, 1999);
        Book myNameIsLegion = new Book("Имя мне легион", grigoriyKlimov, 1975);
        System.out.println(viktorPelevin + " " + generationP);
        System.out.println(grigoriyKlimov + " " + myNameIsLegion);
        System.out.println(grigoriyKlimov);
        System.out.println(generationP.equals(myNameIsLegion) ? "названия книг одинаковые" : "названия книг разные");
        System.out.println(viktorPelevin.equals(grigoriyKlimov) ? "автор тот же" : "автор другой");
        System.out.println(myNameIsLegion.hashCode());
        System.out.println(generationP.hashCode());
        System.out.println(viktorPelevin.hashCode());
        System.out.println(grigoriyKlimov.hashCode());
    }
}

public class Main {


    public static void main(String[] args) {
        Author viktorPelevin = new Author("Виктор ", "Пелевин ");
        Author grigoriyKlimov = new Author("Григорий ", "Климов");

        Book generationP = new Book("Generation\"П\" ", viktorPelevin, 1999);
        Book myNameIsLegion = new Book("Имя мне легион", grigoriyKlimov, 1975);
        System.out.println(generationP);
        System.out.println(myNameIsLegion);
        System.out.println(generationP.equals(myNameIsLegion) ? "названия книг одинаковые" : "названия книг разные");
        System.out.println(viktorPelevin.equals(grigoriyKlimov) ? "автор тот же" : "автор другой");
        System.out.println(myNameIsLegion.hashCode());
        System.out.println(generationP.hashCode());
        System.out.println(viktorPelevin.hashCode());
        System.out.println(grigoriyKlimov.hashCode());

        // System.out.println(" Автор: " + generationP.getAuthor().getName() + " " + generationP.getAuthor().getSurname() +
        //         ",название:" + generationP.getTitle() + ",год издания: " + generationP.getYearPublication());
        // System.out.println(" Автор: " + myNameIsLegion.getAuthor().getName() + " " + myNameIsLegion.getAuthor().getSurname() +
        //         ",название:" + myNameIsLegion.getTitle() + ",год издания: " + myNameIsLegion.getYearPublication());
        // generationP.setYearPublication(1984);
        // System.out.println(" Автор: " + generationP.getAuthor().getName() + " " + generationP.getAuthor().getSurname() +
        //         ",название:" + generationP.getTitle() + ",год издания: " + generationP.getYearPublication());

    }
}

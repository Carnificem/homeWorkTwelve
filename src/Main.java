public class Main {


    public static void main(String[] args) {
        Author viktorPelevin = new Author("Виктор ", "Пелевин ");
        Author grigoriyKlimov = new Author("Григорий ", "Климов");

        book generationP = new book("Generation\"П\" ", viktorPelevin, 1999);
        book myNameIsLegion = new book("Имя мне легион", grigoriyKlimov, 1975);

        System.out.println(" Автор: " + generationP.getAuthor().getNameAuthor() + " " + generationP.getAuthor().getSurnameAuthor() +
                ",название:" + generationP.getTitle() + ",год издания: " + generationP.getYearPublication());
        System.out.println(" Автор: " + myNameIsLegion.getAuthor().getNameAuthor() + " " + myNameIsLegion.getAuthor().getSurnameAuthor() +
                ",название:" + myNameIsLegion.getTitle() + ",год издания: " + myNameIsLegion.getYearPublication());

    }
}

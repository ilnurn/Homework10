package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author authorLordOfRings = new Author("John", "Tolkien");
        Book lordOfTheRings = new Book("Lord of the rings", authorLordOfRings, 1954);
        System.out.println(lordOfTheRings);

        Author authorHarryPotter = new Author("Joanne", "Rowling");
        Book harryPotter = new Book("Harry Potter", authorHarryPotter, 1997);
        System.out.println(harryPotter);

        harryPotter.setPublicationYear(2007);
        System.out.println(harryPotter);

        System.out.println(lordOfTheRings.equals(harryPotter));

        Book harryPotter2 = new Book("Harry Potter", authorHarryPotter, 2010);
        System.out.println(harryPotter.equals(harryPotter2));

        System.out.println(authorHarryPotter.equals(authorLordOfRings));

        Author joanneRowling = new Author("Joanne", "Rowling");
        System.out.println(authorHarryPotter.equals(joanneRowling));
    }
}

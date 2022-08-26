public interface Reader {
    default void getBooks(){
        System.out.println("Я возьму эту книгу");
    }
    default void returnBooks(){
        System.out.println("Я возвращаю книги");
    }
}

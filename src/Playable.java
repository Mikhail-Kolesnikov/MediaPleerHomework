public interface Playable {
    void play();


    default void printInfo(){
        System.out.println("Мы имеем дело с запускаемы фаилом ");
    }
}

public class NoteDemo {
    public static void main(String[] args) {
        Note note = new Note("Do homework");
        Note note2 = new Note();

        note.setIsCompleted(true);
        note.info();
        note2.info();
    }    
}

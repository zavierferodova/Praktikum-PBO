import java.util.Date;

public class Note {
    private String title;
    private Date date;
    private boolean isCompleted = false;

    public Note() {
        this.title = "Blank Note";
        this.date = new Date();
    }

    public Note(String title) {
        this.title = title;
        this.date = new Date();
    }

    void setTitle(String title) {
        this.title = title;
    }
    
    void setIsCompleted(boolean isComplete) {
        this.isCompleted = isComplete;
    }

    void info() {
        System.out.println("Note title  : " + this.title); 
        System.out.println("Note date   : " + this.date);
        System.out.println("Note status : " + (this.isCompleted ? "Completed" : "Not Completed"));
        System.out.println();
    }
}

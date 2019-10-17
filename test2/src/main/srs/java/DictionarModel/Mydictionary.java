import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="wordstore")
public class Mydictionary implements Serializable {
       @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column
    private int id;
     @Column
    private String wordname;
     @Column
    private String type;
     @Column
    private String example;

    public Mydictionary(String wordname) {
        this.wordname = wordname;
    }

    public Mydictionary(String wordname, String type, String example) {
        this.wordname = wordname;
        this.type = type;
        this.example = example;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWordname() {
        return wordname;
    }

    public void setWordname(String wordname) {
        this.wordname = wordname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    @Override

    public String toString(){

        return "name"+wordname+"type"+type+"example"+example;
    }
}

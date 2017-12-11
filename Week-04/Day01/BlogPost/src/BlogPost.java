import java.text.DateFormat;
import java.util.Date;

public class BlogPost {
  
  private  String authorName;
  private String title;
  private String text;
  private String publicationDate;
  
  public BlogPost(String title, String authorName) {
    this.title = title;
    this.authorName = authorName;
  }
  
  public void setPublicationDate(String publicationDate){
    this.publicationDate = publicationDate;
  }
  
  public void setText(String text){
    this.text = text;
  }
  
  
}

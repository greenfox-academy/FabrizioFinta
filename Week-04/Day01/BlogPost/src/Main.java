import java.text.DateFormat;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
    BlogPost firstPost = new BlogPost("Lorem Ipsum", "John Doe");
    firstPost.setPublicationDate("2000.05.04.");
    firstPost.setText("Lorem ipsum dolor sit amet.");
    
    BlogPost secondPost = new BlogPost("Wait but why", "Tim Urban");
    secondPost.setPublicationDate("2010.10.10.");
    secondPost.setText("A popular long-form, stick-figure-illustrated blog about almost everything.");
    
    BlogPost thirdPost = new BlogPost("One Engineer Is Trying to Get IBM to Reckon With Trump", "William Turton");
    thirdPost.setPublicationDate("2017.03.28.");
    thirdPost.setText("Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.");
  }
}

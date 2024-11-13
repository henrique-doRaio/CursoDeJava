package ComentariosPosts;

import ComentariosPosts.ComentariosPostsCod.Post;
import ComentariosPosts.ComentariosPostsComments.Comment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat stf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Locale.setDefault(Locale.US);

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome! ");
        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the force be with you");

        Post p1 = new Post(stf.parse("21/06/2018 13:05:44") , "Treveling to New Zealand", "I'm going to visit this wonderful country! " , 12);
        p1.addComments(c1);
        p1.addComments(c2);

        Post p2 = new Post(stf.parse("28/07/2018 23:14:19") , "Good night guys" , "See you tomorrow", 5);

        p2.addComments(c3);
        p2.addComments(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}

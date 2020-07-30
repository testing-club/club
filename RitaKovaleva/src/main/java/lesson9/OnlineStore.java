package lesson9;

import java.io.File;
import java.util.ArrayList;

public class OnlineStore {
    static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        User user1 = new User("John", "Smith", "johnsmith@gmail.com");
        user1.setFacebookId("john.smith");
        users.add(user1);


        User user2 = new User("Sam", "Potter", "johnpotter@gmail.com");
        user2.setFacebookId("johm.potter");
        user2.setInstagramId("johm_happy_potter");
        users.add(user2);

        User user3 = new User("Tom", "Potter", "tompotter@gmail.com");
        user3.setFacebookId("tom.potter");
        user3.setInstagramId("love999");
        user3.setTelegramId("potterNotHarry");
        users.add(user3);

        sendNewCollectionMailOut();


        //Task send: this to Tom's instagram
        File postCard = new File("//path-to-file");

        postToInstagram(user3,postCard);

    }


    private static void sendNewCollectionMailOut(){
        users.forEach(user -> {
            ArrayList<MessageSender> list = user.getSocialMediaList();
            list.forEach(socialMedia -> {
                String message = String.format("Hello %s! We have awesome new autumn collection available! - Sent through %s", user.getName(), socialMedia.getMessengerName());
                socialMedia.sendPrivateMessage(message);
                System.out.println(message);
            });
        });
    }

    // Solution for the upper task

    private static void postToInstagram(User user, Object object) {
        InstagramClient instagramClient = new InstagramClient(user.getInstagramId());
        instagramClient.postPublicMessage(object);
    }
}

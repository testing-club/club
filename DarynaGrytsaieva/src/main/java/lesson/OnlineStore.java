package lesson9;

import java.io.File;
import java.util.ArrayList;

public class OnlineStore {
    private static ArrayList<User> clients = new ArrayList<>();

    public static void main(String[] args) {
        User user1 = new User("John", "Smith", "johnsmith@gmail.com");
        user1.setFacebookId("john.smith");
        clients.add(user1);

        User user2 = new User("Sam", "Smith", "samsmith@gmail.com");
        user2.setFacebookId("sam.smith");
        user2.setInstagramId("sam_sunny");
        clients.add(user2);

        User user3 = new User("Sam", "Potter", "sampotter@gmail.com");
        user3.setFacebookId("sam.potter");
        user3.setTelegramId("potterMan");
        user3.setInstagramId("love999");
        clients.add(user3);


        sendPrivateNewYearCongratulationToAll();


        Object picture = new File("//path-to-file.jpeg");
        postPictureToFeedToAll(picture);

    }

    private static void sendPrivateNewYearCongratulationToAll() {

        for (User client : clients) {
            for (MessageSender socialMediaClient : client.getSocialMediaClientsList()) {
                String message = String.format("Hello %s! We have new awesome autumn collection available online! - Posted through %s", client.getName(), socialMediaClient.getMessengerName());

                socialMediaClient.sendPrivateMessage(message);

                System.out.println(message);
            }
        }
    }

    private static void postPictureToFeedToAll(Object picture) {
        clients.forEach(client -> {
        for (MessageSender socialMediaClient : client.getSocialMediaClientsList()) {
            if (socialMediaClient instanceof PublicPoster)
                System.out.println("yes");
                ((PublicPoster) socialMediaClient).postPublicMessage(picture);
        }});
    }
}

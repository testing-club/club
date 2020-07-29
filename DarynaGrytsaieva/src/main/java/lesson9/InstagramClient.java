package lesson9;

public class InstagramClient implements MessageSender, PublicPoster {
    private String instagramId;

    @Override
    public void sendPrivateMessage(String message) {
    // https://www.instagram.com/developer/
    }

    @Override
    public void postPublicMessage(Object object) {
        // do smth
    }
}

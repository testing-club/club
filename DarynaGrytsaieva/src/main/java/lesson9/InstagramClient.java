package lesson9;

public class InstagramClient implements MessageSender, PublicPoster {
    private String instagramId;

    public InstagramClient(String instagramId) {
        this.instagramId = instagramId;
    }

    @Override
    public void sendPrivateMessage(String message) {
        // https://www.instagram.com/developer/
    }

    @Override
    public String getMessengerName() {
        return "Instagram";
    }

    @Override
    public void postPublicMessage(Object object) {
        // https://www.instagram.com/developer/

    }
}

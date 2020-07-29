package lesson9;

public class InstagramClient implements MessageSender {
    private String instagramId;

    InstagramClient(String instagramId) {
        this.instagramId = instagramId;
    }

    @Override
    public void sendPrivateMessage(String message) {

        // Search for Instagram sdk
        // https://developers.facebook.com/docs/instagram-basic-display-api#legacy-ids
    }

    @Override
    public String getMessengerName() {
        return "Instagram";
    }
}

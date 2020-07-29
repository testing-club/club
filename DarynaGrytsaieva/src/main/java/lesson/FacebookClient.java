package lesson;

public class FacebookClient implements PublicPoster, MessageSender {
    private String facebookId;

    public FacebookClient(String facebookId) {
        this.facebookId = facebookId;
    }

    public void inviteToGroup(){}

    @Override
    public void sendPrivateMessage(String message) {
        //https://developers.facebook.com/docs/messenger-platform/reference/send-api/
    }


    @Override
    public void postPublicMessage(Object picture) {

    }

    @Override
    public String getMessengerName() {
        return "FacebookClient";
    }
}

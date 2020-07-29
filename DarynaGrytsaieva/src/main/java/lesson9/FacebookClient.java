package lesson9;

public class FacebookClient implements MessageSender, PublicPoster {
    private String facebookId;

    public FacebookClient(String facebookId) {
        this.facebookId = facebookId;
    }

    @Override
    public void sendPrivateMessage(String message) {
        //Read https://developers.facebook.com/docs/apis-and-sdks/
    }

    @Override
    public String getMessengerName() {
        return "Facebook";
    }

    void inviteToGroup() {
    }

    ;

    @Override
    public void postPublicMessage(Object object) {
        // do smth
    }

}

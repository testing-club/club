package lesson9;

public class FacebookClient implements MessageSender, PublicPoster {
    private String facebookId;

    @Override
    public void sendPrivateMessage(String message) {

        //Read https://developers.facebook.com/docs/apis-and-sdks/

    }

    void inviteToGroup(){};

    @Override
    public void postPublicMessage(Object object) {
        // do smth
    }

}

package lesson9;

public class TelegramClient implements MessageSender {
    private String instagramId;

    public TelegramClient(String instagramId) {
        this.instagramId = instagramId;
    }

    @Override
    public void sendPrivateMessage(String message) {
        // https://core.telegram.org/
    }

    @Override
    public String getMessengerName() {
        return "Telegram";
    }
}

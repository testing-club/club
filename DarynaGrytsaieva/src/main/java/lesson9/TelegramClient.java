package lesson9;

public class TelegramClient implements MessageSender {
    private String telegramId;

    public TelegramClient(String telegramId) {
        this.telegramId = telegramId;
    }

    @Override
    public void sendPrivateMessage(String message) {
        //Read https://core.telegram.org/#tdlib-build-your-own-telegram

    }

    @Override
    public String getMessengerName() {
        return "Telegram";
    }

    public void sendSticker(){};
}

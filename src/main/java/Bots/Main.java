package Bots;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;


public class Main {
    public static void main(String[] args) throws LoginException, InterruptedException {
        System.err.print(Secret.TutorialBotToken);
        System.out.print(Secret.TutorialBotToken);
        JDA TutorialBot = JDABuilder.createDefault(Secret.TutorialBotToken,
            GatewayIntent.GUILD_MESSAGES,
            GatewayIntent.DIRECT_MESSAGES,
            GatewayIntent.GUILD_VOICE_STATES, 
            GatewayIntent.GUILD_EMOJIS,
            GatewayIntent.GUILD_MESSAGE_REACTIONS)
            .addEventListeners(new Listener())
            .setActivity(Activity.playing("Use chovk"))
                .build().awaitReady();
    }
}

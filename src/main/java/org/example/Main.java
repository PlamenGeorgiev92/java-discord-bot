package org.example;


import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.example.commands.music.Play;
import org.example.commands.music.Stop;

public class Main {
    public static void main(String[] args) {

        JDA jda = JDABuilder.createDefault(args[0]).build();
        jda.addEventListener(new Listeners());
        CommandManager manager = new CommandManager();

        manager.add(new Play());
        manager.add(new Stop());

        jda.addEventListener(manager);

    }
}
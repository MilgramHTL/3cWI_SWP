package at.milgram.word.guesser;

import java.util.Random;
import java.util.Scanner;

public class Word_Guesser_Ex_1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] words = {"Aatrox", "Ahri", "Akali", "Alistar", "Amumu", "Anivia", "Annie", "Aphelios", "Ashe", "Aurelion Sol", "Azir", "Bard", "Blitzcrank", "Brand", "Braum", "Caitlyn", "Camille", "Cassiopeia", "Cho'Gath", "Corki", "Darius", "Diana", "Dr. Mundo", "Draven", "Ekko", "Elise", "Evelynn", "Ezreal", "Fiddlesticks", "Fiora", "Fizz", "Galio", "Gangplank", "Garen", "Gnar", "Gragas", "Graves", "Hecarim", "Heimerdinger", "Illaoi", "Irelia", "Ivern", "Janna", "Jarvan IV", "Jax", "Jayce", "Jhin", "Jinx", "Kai'Sa", "Kalista", "Karma", "Karthus", "Kassadin", "Katarina", "Kayle", "Kayn", "Kennen", "Kha'Zix", "Kindred", "Kled", "Kog'Maw", "LeBlanc", "Lee Sin", "Leona", "Lillia", "Lissandra", "Lucian", "Lulu", "Lux", "Malphite", "Malzahar", "Maokai", "Master Yi", "Miss Fortune", "Mordekaiser", "Morgana", "Nami", "Nasus", "Nautilus", "Neeko", "Nidalee", "Nocturne", "Nunu & Willump", "Olaf", "Orianna", "Ornn", "Pantheon", "Poppy", "Pyke", "Qiyana", "Quinn", "Rakan", "Rammus", "Rek'Sai", "Rell", "Renekton", "Rengar", "Riven", "Rumble", "Ryze", "Samira", "Sejuani", "Senna", "Seraphine", "Sett", "Shaco", "Shen", "Shyvana", "Singed", "Sion", "Sivir", "Skarner", "Sona", "Soraka", "Swain", "Sylas", "Syndra", "Tahm Kench", "Taliyah", "Talon", "Taric", "Teemo", "Thresh", "Tristana", "Trundle", "Tryndamere", "Twisted Fate", "Twitch", "Udyr", "Urgot", "Varus", "Vayne", "Veigar", "Vel'Koz", "Vi", "Viego", "Viktor", "Vladimir", "Volibear", "Warwick", "Wukong", "Xayah", "Xerath", "Xin Zhao", "Yasuo", "Yone", "Yorick", "Yuumi", "Zac", "Zed", "Zeri", "Zilean", "Zoe", "Zyra"};
        Random random = new Random();
        String randomWord = words[random.nextInt(words.length)];
        char[] result = new char[randomWord.length()];
        for (int i = 0; i < result.length; i++) {
            if (randomWord.charAt(i) == ' ') {
                result[i] = ' ';
            } else {
                result[i] = '*';
            }
        }

        int attempts = 0;
        boolean guessed = false;

        System.out.println("Willkommen! Viel Spaß beim Wort erraten.");
        while (!guessed) {
            System.out.println(result);
            System.out.print("Welcher Buchstabe könnte im gesuchten Wort stecken? Beachte das Großbuchstaben als eigener Buchstabe zählen. ");
            char letter = scanner.next().charAt(0);

            boolean letterFound = false;
            for (int i = 0; i < randomWord.length(); i++) {
                if (randomWord.charAt(i) == letter) {
                    result[i] = letter;
                    letterFound = true;
                }
            }
            if (!letterFound) {
                attempts++;
            } else if (randomWord.equals(new String(result))) {
                guessed = true;
                System.out.println("Glückwunsch, du hast das Wort erraten: " + randomWord + " und hast " + attempts + " Versuche benötigt.");
            }
        }
        scanner.close();
    }
}


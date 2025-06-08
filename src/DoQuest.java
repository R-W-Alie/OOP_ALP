import java.util.*;

public class DoQuest {
    private static final List<String> veryEasyQuests = Arrays.asList(
            "Drink a glass of water 💧",
            "Take 3 deep breaths 🌬️",
            "Stretch your arms for 10 seconds 🙆‍♂️",
            "Open a window and take a fresh breath 🌤️",
            "Smile at yourself in the mirror 😊",
            "Write one word that describes your mood 🖊️",
            "Touch your toes or try 👣",
            "Look away from your screen for 20 seconds 👀",
            "Snap your fingers 10 times 🫰",
            "Clap your hands three times 👏",
            "Say one positive word out loud 🗣️",
            "Make a silly face to yourself 😜",
            "Stand up for 15 seconds 🧍‍♂️");

    private static final List<String> easyQuests = Arrays.asList(
            "Write a one-sentence journal entry 📓",
            "Do 5 jumping jacks or squats 🏃‍♀️",
            "Eat one fruit 🍎",
            "Play your favorite song 🎶",
            "Write one thing you’re grateful for 🙏",
            "Walk for 2 minutes 🚶",
            "Write one goal for tomorrow 🎯",
            "Drink a full bottle of water 🍼",
            "Do a 30-second dance 💃",
            "Stretch your whole body for 30 seconds 🙆‍♀️");

    private static final List<String> harderQuests = Arrays.asList(
            "Journal for 5+ minutes 📘",
            "Exercise or move for 10 minutes 💪",
            "Meditate for 5 minutes 🧘‍♂️",
            "Make a healthy meal or snack 🥗",
            "Read 3+ pages of a book 📚",
            "Declutter a drawer or shelf 🗃️",
            "Write about something you want to improve ✍️",
            "Go offline for 30+ minutes 📴",
            "Reflect on your week in writing 📅",
            "Stretch for 5 minutes with calming music 🎼");

    public static List<String> get5QuestsByLevel(int level) {
        List<String> pool;

        if (level <= 3) {
            pool = new ArrayList<>(veryEasyQuests);
        } else if (level <= 6) {
            pool = new ArrayList<>(easyQuests);
        } else {
            pool = new ArrayList<>(harderQuests);
        }

        Collections.shuffle(pool); // Shuffle the list for randomness
        return pool.subList(0, Math.min(5, pool.size())); // Return up to 5 quests
    }
}
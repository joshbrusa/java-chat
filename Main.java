import java.util.Scanner;
import java.util.Random;

public class Main {

    private static String generateResponse(String userInput) {
        Random random = new Random();

        String[] greetings = { "Hello!", "Hi there!", "Greetings!" };
        String[] feelings = { "I'm doing well, thank you!",
                "I'm just a computer program, so I don't have feelings, but I'm here to help you!",
                "I'm here to assist you!" };

        switch (userInput.toLowerCase()) {
            case "hello":
                return greetings[random.nextInt(greetings.length)];
            case "hi":
                return greetings[random.nextInt(greetings.length)];
            case "how are you":
                return feelings[random.nextInt(feelings.length)];
            case "name":
                return "I'm just a chat bot. I don't have a name.";
            case "bye":
                return "Goodbye!";
            default:
                return "I'm not sure how to respond to that. Ask me something else.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! I'm your chat bot. How can I assist you today?");
        String userInput;

        do {
            System.out.print("You: ");
            userInput = scanner.nextLine();

            String botResponse = generateResponse(userInput);
            System.out.println("Bot: " + botResponse);

        } while (!userInput.equalsIgnoreCase("bye"));

        System.out.println("Goodbye! Have a great day!");
        scanner.close();
    }
}

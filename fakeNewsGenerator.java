import java.util.Random;

public class fakeNewsGenerator {
    public static void main(String[] args) {
        String[] people = {" DEVI RAJ", " DOLAAND TRUMP", "HARSH AWASTHI"};
        String[] actions = {"DANCING", " he destroyed", "TARRIFS", " DANCING WITH"};
        String[] places = {"WASHINGTON DC", " AKTU", "DUIIPUR"};
        String[] objects = {"BY USING QUANTUM ", " a blunder", "alien technology"};
        String[] templates = {
            "BREAKING: %s %s %s!",
            "Shocking news: %s  %s %s  %s!",
            "You won't believe what %s did with %s in %s!"
        };
        
        Random rand = new Random();

        // Pick random elements
        String person = people[rand.nextInt(people.length)];
        String action = actions[rand.nextInt(actions.length)];
        String place = places[rand.nextInt(places.length)];
        String object = objects[rand.nextInt(objects.length)];
        String template = templates[rand.nextInt(templates.length)];

        // Generate the fake news
        String news = String.format(template, person, action, place, object);
        System.out.println(news);
    }
}

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        CreateAnimalServiceImpl a = new CreateAnimalServiceImpl();

        var list1 = a.createAnimal(10); // for
        var list2 = a.useSuperMethod(10); // while
        var list3 = a.useDoWhile(10); // do While

        SearchServiceImpl searchService = new SearchServiceImpl();

        System.out.println(Arrays.toString(searchService.findOlderAnimal(list1.toArray(new AbstractAnimal[0]), 12)));
        searchService.findDuplicate(list2.toArray(new AbstractAnimal[0]));
        System.out.println(Arrays.toString(searchService.findLeapYearNames(list3.toArray(new AbstractAnimal[0]))));

        // Тест с корректными данными
        test();
    }

    private static void test() {
        System.out.println("\n___---___ TEST ___---___");
        SearchServiceImpl searchService = new SearchServiceImpl();
        var p0 = new Predator();
        var p1 = new Predator();
        var p2 = new Predator();
        var p3 = new Predator();

        p0.setBirthDate(LocalDate.now().minusYears(31));
        p1.setBirthDate(LocalDate.now().minusYears(21));
        p2.setBirthDate(LocalDate.now().minusYears(4));
        p3.setBirthDate(LocalDate.now().minusYears(8));

        p0.setName("P0 Name");
        p1.setName("P1 Name");
        p2.setName("P2 Name");
        p3.setName("P3 Name");

        System.out.println(Arrays.toString(searchService.findOlderAnimal(new AbstractAnimal[]{p0, p1}, 19)));
        searchService.findDuplicate(new AbstractAnimal[]{p0, p0, p1, p0, p1});
        searchService.findDuplicate(new AbstractAnimal[]{p0, p0, p1, p0});
        System.out.println(Arrays.toString(searchService.findLeapYearNames(new AbstractAnimal[]{p0, p0, p1, p2, p3})));
        System.out.println("___---___ TEST ___---___");
    }
}
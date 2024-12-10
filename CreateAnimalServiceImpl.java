import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CreateAnimalServiceImpl implements CreateAnimalService {

    @Override
    public List<AbstractAnimal> createAnimal(int n) {
        List<AbstractAnimal> list = new ArrayList<>();
        System.out.println("Override");
        for (int i = 0; i < n; i++) {
            Predator p = new Predator();
            p.setBreed("ABC " + UUID.randomUUID());
            p.setName("ZXC " + UUID.randomUUID());
            p.setCharacter("QWERTY " + UUID.randomUUID());
            p.setCost(100d);
            System.out.println(p);
            list.add(p);
        }
        return list;
    }

    /**
     * Тоже самое создание что и через createAnimal, но с использованием super метода
     * @param n - количесвто для создания
     * @return лист сущностей
     */
    public List<AbstractAnimal> useSuperMethod(int n) {
        System.out.println("SuperMethod");
        return CreateAnimalService.super.createAnimal(n);
    }

    /**
     * Тоже самое создание что и через createAnimal, но с использованием do While
     * @param n - количесвто для создания
     * @return лист сущностей
     */
    public List<AbstractAnimal> useDoWhile(int n) {
        int i = 0;
        List<AbstractAnimal> list = new ArrayList<>();
        System.out.println("DoWhile");
        do {
            Predator p = new Predator();
            p.setBreed("ABC " + UUID.randomUUID());
            p.setName("ZXC " + UUID.randomUUID());
            p.setCharacter("QWERTY " + UUID.randomUUID());
            p.setCost(100d);
            i++;
            System.out.println(p);
            list.add(p);
        } while (i < n);
        return list;
    }

}

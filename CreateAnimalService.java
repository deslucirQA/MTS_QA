import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public interface CreateAnimalService {

    /**
     * Метод создает сущность в количестве n штук
     * @param n - количесвто для создания
     * @return лист сущностей
     */
    default List<AbstractAnimal> createAnimal(int n) {
        int i = 0;
        List<AbstractAnimal> list = new ArrayList<>();
        while (i < n) {
            Predator p = new Predator();
            p.setBreed("ABC " + UUID.randomUUID());
            p.setName("ZXC " + UUID.randomUUID());
            p.setCharacter("QWERTY " + UUID.randomUUID());
            p.setCost(100d);
            System.out.println(p);
            i++;
            list.add(p);
        }
        return list;
    }

}

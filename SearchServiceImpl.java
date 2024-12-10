import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchServiceImpl implements SearchService {

    @Override
    public String[] findLeapYearNames(AbstractAnimal[] array) {
        List<String> resultsName = new ArrayList<>();
        for (AbstractAnimal animal : array) {
            if (animal.getBirthDate() != null && isLeapYear(animal.getBirthDate().getYear())) {
                resultsName.add(animal.getName());
            }
        }
        return resultsName.toArray(new String[0]);
    }

    @Override
    public AbstractAnimal[] findOlderAnimal(AbstractAnimal[] array, int n) {
        List<AbstractAnimal> list = new ArrayList<>();
        LocalDate now = LocalDate.now();
        int nowYear = now.getYear();

        for (AbstractAnimal animal : array) {
            if (animal.getBirthDate() != null && n < nowYear - animal.getBirthDate().getYear()) {
                list.add(animal);
            }
        }
        return list.toArray(new AbstractAnimal[0]);
    }

    @Override
    public void findDuplicate(AbstractAnimal[] array) {
        Map<AbstractAnimal, Integer> map = new HashMap<>();

        for (AbstractAnimal animal : array) {
            if (map.containsKey(animal)) {
                map.put(animal, map.get(animal) + 1);
            } else map.put(animal, 1);
        }

        var keys = map.keySet();

        for (AbstractAnimal animal : keys) {
            if (map.get(animal) > 1) {
                System.out.println(animal);
            }
        }
    }

    private boolean isLeapYear(int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }
}
